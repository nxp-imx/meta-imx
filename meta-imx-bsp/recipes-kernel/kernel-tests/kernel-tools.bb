# Copyright 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Kernel test tools for Linux"
DESCRIPTION = "Kernel test tools for Linux"
LICENSE = "GPL-2.0-only"

do_configure[depends] += "virtual/kernel:do_shared_workdir"

inherit linux-kernel-base kernel-arch
inherit kernelsrc

S = "${WORKDIR}/${BP}"

PACKAGECONFIG ??= " \
    ${PACKAGECONFIG_VIRTIO} \
    ${PACKAGECONFIG_VSOCK} \
"
PACKAGECONFIG_VIRTIO              = ""
PACKAGECONFIG_VIRTIO:mx8m-nxp-bsp = "virtio"
PACKAGECONFIG_VSOCK               = "vsock"
PACKAGECONFIG_VSOCK:mx6-nxp-bsp   = ""
PACKAGECONFIG_VSOCK:mx7-nxp-bsp   = ""

PACKAGECONFIG[vsock] = ",,liburing"

KERNEL_PCITEST_SRC ?= " \
    include \
    tools/arch \
    tools/build \
    tools/include \
    tools/lib \
    tools/Makefile \
    tools/iio \
    tools/pci \
    tools/scripts \
    ${@bb.utils.contains('PACKAGECONFIG', 'virtio', 'tools/virtio', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'vsock',  'tools/testing/vsock', '', d)} \
"

do_configure[prefuncs] += "copy_pci_source_from_kernel"
python copy_pci_source_from_kernel() {
    sources = (d.getVar("KERNEL_PCITEST_SRC") or "").split()
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

EXTRA_OEMAKE = '\
    CROSS_COMPILE=${TARGET_PREFIX} \
    ARCH=${ARCH} \
    CC="${CC}" \
    AR="${AR}" \
    LD="${LD}" \
    DESTDIR="${D}" \
    VSOCK_INSTALL_PATH="${D}${bindir}" \
'

do_compile() {
    unset CFLAGS
    oe_runmake -C ${S}/tools/pci
    oe_runmake -C ${S}/tools/iio
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'vsock', d)} = "vsock" ]; then
        oe_runmake -C ${S}/tools/testing/vsock
    fi
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'virtio', d)} = "virtio" ]; then
        oe_runmake -C ${S}/tools/virtio  virtio-ivshmem-console virtio-ivshmem-block
    fi
}

do_install() {
    unset CFLAGS
    oe_runmake -C ${S}/tools/pci install
    oe_runmake -C ${S}/tools/iio install
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'vsock', d)} = "vsock" ]; then
        oe_runmake -C ${S}/tools/testing/vsock install
    fi
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'virtio', d)} = "virtio" ]; then
        install ${S}/tools/virtio/virtio-ivshmem-console  ${D}${bindir}/
        install ${S}/tools/virtio/virtio-ivshmem-block    ${D}${bindir}/
    fi
}

ALLOW_EMPTY:${PN} = "1"
ALLOW_EMPTY:${PN}-virtio = "1"
ALLOW_EMPTY:${PN}-vsock = "1"

PACKAGES =+ "${PN}-pci ${PN}-virtio ${PN}-iio ${PN}-vsock"

FILES:${PN}-pci = "${bindir}/pci*"
FILES:${PN}-iio = "${bindir}/lsiio ${bindir}/iio*"
FILES:${PN}-virtio = "${bindir}/virtio-ivshmem-*"
FILES:${PN}-vsock = "${bindir}/vsock*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
