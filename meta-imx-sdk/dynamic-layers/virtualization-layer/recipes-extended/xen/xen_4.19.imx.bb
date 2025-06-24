# Copyright 2024 NXP
HOMEPAGE = "http://xen.org"
LICENSE = "GPL-2.0-only"
SECTION = "console/tools"
LIC_FILES_CHKSUM ?= "file://COPYING;md5=d1a1e216f80b6d8da95fec897d0dbec9"

require xen-common.inc
require recipes-extended/xen/xen.inc
require recipes-extended/xen/xen-hypervisor.inc

DEPENDS:append = " qemu"

S = "${WORKDIR}/git"

do_deploy:append (){
    cd ${DEPLOYDIR}
    if [ -f ${DEPLOYDIR}/xen-${MACHINE} ]; then
        ln -sf xen-${MACHINE} xen
    fi

    if [ -f ${DEPLOYDIR}/xen-${MACHINE}.gz ]; then
        ln -sf xen-${MACHINE}.gz xen.gz
    fi

    if [ -f ${DEPLOYDIR}/xen-${MACHINE}.efi ]; then
        ln -sf xen-${MACHINE}.efi xen.efi
    fi
}

DEFAULT_PREFERENCE ??= "-1"
COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
