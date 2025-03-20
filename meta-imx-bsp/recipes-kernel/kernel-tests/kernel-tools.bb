# Copyright 2020,2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Kernel test tools for Linux"
DESCRIPTION = "Kernel test tools for Linux"
LICENSE = "GPL-2.0-only"

require kernel-tools.inc

PACKAGECONFIG ??= " \
    ${PACKAGECONFIG_VIRTIO} \
    ${PACKAGECONFIG_VSOCK} \
"
PACKAGECONFIG_VIRTIO              = ""
PACKAGECONFIG_VIRTIO:mx8m-nxp-bsp = "virtio"
PACKAGECONFIG_VSOCK               = "vsock"
PACKAGECONFIG_VSOCK:mx6-nxp-bsp   = ""
PACKAGECONFIG_VSOCK:mx7-nxp-bsp   = ""

PACKAGECONFIG[virtio] = ",,"
PACKAGECONFIG[vsock] = ",,liburing"

KERNEL_TOOLS_SRC:append = " \
    tools/iio \
    ${@bb.utils.contains('PACKAGECONFIG', 'virtio', 'tools/virtio', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'vsock',  'tools/testing/vsock', '', d)} \
"

EXTRA_OEMAKE:append = ' \
    VSOCK_INSTALL_PATH="${D}${bindir}" \
'

do_compile() {
    unset CFLAGS
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
    oe_runmake -C ${S}/tools/iio install
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'vsock', d)} = "vsock" ]; then
        oe_runmake -C ${S}/tools/testing/vsock install
    fi
    if [ ${@bb.utils.filter('PACKAGECONFIG', 'virtio', d)} = "virtio" ]; then
        install ${S}/tools/virtio/virtio-ivshmem-console  ${D}${bindir}/
        install ${S}/tools/virtio/virtio-ivshmem-block    ${D}${bindir}/
    fi
}


ALLOW_EMPTY:${PN}-virtio = "1"
ALLOW_EMPTY:${PN}-vsock = "1"

PACKAGES =+ "${PN}-virtio ${PN}-iio ${PN}-vsock"

FILES:${PN}-iio = "${bindir}/lsiio ${bindir}/iio*"
FILES:${PN}-virtio = "${bindir}/virtio-ivshmem-*"
FILES:${PN}-vsock = "${bindir}/vsock*"
