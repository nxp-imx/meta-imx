FILESEXTRAPATHS:prepend := "${THISDIR}/llvm-project-source:"

SRC_URI += " \
    file://0001-libclc-Backport-improved-tgamma-from-upstream-main-m.patch \
    file://0002-libclc-Restore-always_inline-for-SPIR-V-targets.patch"
