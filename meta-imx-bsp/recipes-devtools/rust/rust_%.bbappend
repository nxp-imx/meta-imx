# Align Rust's LLVM backend discovery with the trimmed target LLVM.
#
# meta-imx reduces LLVM_TARGETS_TO_BUILD:class-target to only the target
# architecture + BPF + GPU backends via llvm_git.bbappend.  However, Rust's
# rust_runx() copies the native llvm-config into the target sysroot (since the
# real target binary can't run on the build host).  This native llvm-config
# reports ALL backends.  rustc_llvm's build.rs calls "llvm-config --components"
# and conditionally compiles LLVMInitialize* calls for every reported backend.
# At link time the target libLLVM.so only contains the trimmed backends,
# producing undefined reference errors.
#
# Fix: in do_install:prepend, install a shell wrapper llvm-config at
# RUST_ALTERNATE_EXE_PATH that filters --components and --targets-built
# to only report backends present in the target LLVM.  All other queries
# are passed through to the native binary.

# Compute target LLVM backends to match meta-imx's llvm_git.bbappend:
#   LLVM_TARGETS_TO_BUILD:class-target = "${@get_clang_target_arch(bb,d)};BPF;${LLVM_TARGETS_GPU}"
RUST_LLVM_TARGET_BACKENDS ?= ""
python () {
    import re
    if bb.data.inherits_class('native', d) or bb.data.inherits_class('nativesdk', d):
        return
    a = d.getVar('TARGET_ARCH') or ''
    backends = []
    if   re.match(r'(i.86|athlon|x86.64)$', a): backends.append('x86')
    elif re.match(r'arm(eb)?$', a):              backends.append('arm')
    elif re.match(r'aarch64(_be)?$', a):         backends.append('aarch64')
    elif re.match(r'mips', a):                   backends.append('mips')
    elif re.match(r'riscv(32|64)$', a):          backends.append('riscv')
    elif re.match(r'p(pc|owerpc)', a):           backends.append('powerpc')
    elif re.match(r'loongarch64$', a):           backends.append('loongarch')
    backends.append('bpf')
    distro = (d.getVar('DISTRO_FEATURES') or '').split()
    if any(f in distro for f in ('opencl', 'opengl', 'vulkan')):
        backends.append('spirv')
    d.setVar('RUST_LLVM_TARGET_BACKENDS', ' '.join(backends))
}

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append:class-target = " file://llvm-config-wrapper.in"

do_install:prepend:class-target() {
    create_target_llvm_config_wrapper
}

create_target_llvm_config_wrapper() {
    if [ "${RUST_ALTERNATE_EXE_PATH_NATIVE}" = "${RUST_ALTERNATE_EXE_PATH}" ]; then
        return
    fi

    mkdir -p $(dirname "${RUST_ALTERNATE_EXE_PATH}")

    install -m 0755 "${UNPACKDIR}/llvm-config-wrapper.in" "${RUST_ALTERNATE_EXE_PATH}"

    sed -i "s|@@NATIVE@@|${RUST_ALTERNATE_EXE_PATH_NATIVE}|g" "${RUST_ALTERNATE_EXE_PATH}"
    sed -i "s|@@ALLOWED@@|${RUST_LLVM_TARGET_BACKENDS}|g"     "${RUST_ALTERNATE_EXE_PATH}"

    bbnote "rust: created llvm-config wrapper with backends: ${RUST_LLVM_TARGET_BACKENDS}"
}
