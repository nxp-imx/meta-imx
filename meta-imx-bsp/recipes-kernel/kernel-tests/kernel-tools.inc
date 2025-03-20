do_configure[depends] += "virtual/kernel:do_shared_workdir"

inherit linux-kernel-base kernel-arch
inherit kernelsrc

S = "${WORKDIR}/${BP}"

do_configure[prefuncs] += "copy_source_from_kernelsrc"
python copy_source_from_kernelsrc() {
    sources = (d.getVar("KERNEL_TOOLS_SRC") or "").split()
    src_dir = d.getVar("STAGING_KERNEL_DIR")
    dest_dir = d.getVar("S")
    bb.utils.mkdirhier(dest_dir)
    for s in sources:
        src = oe.path.join(src_dir, s)
        dest = oe.path.join(dest_dir, s)
        if not os.path.exists(src):
            bb.fatal("Path does not exist: %s. Maybe PERF_SRC does not match the kernel version." % src)
        if os.path.isdir(src):
            oe.path.copyhardlinktree(src, dest)
        else:
            bb.utils.copyfile(src, dest)
}

KERNEL_TOOLS_SRC ?= " \
    include \
    tools/arch \
    tools/build \
    tools/include \
    tools/lib \
    tools/Makefile \
    tools/scripts \
"

EXTRA_OEMAKE = '\
    CROSS_COMPILE=${TARGET_PREFIX} \
    ARCH=${ARCH} \
    CC="${CC}" \
    AR="${AR}" \
    LD="${LD}" \
    DESTDIR="${D}" \
'

ALLOW_EMPTY:${PN} = "1"
# Work around do_package_qa error
INSANE_SKIP:${PN}-dbg += "buildpaths"

PACKAGE_ARCH = "${MACHINE_ARCH}"
