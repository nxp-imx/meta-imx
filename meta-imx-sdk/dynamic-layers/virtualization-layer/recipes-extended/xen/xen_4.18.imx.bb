# Copyright 2024 NXP
HOMEPAGE = "http://xen.org"
LICENSE = "GPL-2.0-only"
SECTION = "console/tools"
LIC_FILES_CHKSUM ?= "file://COPYING;md5=d1a1e216f80b6d8da95fec897d0dbec9"

require recipes-extended/xen/xen.inc
require xen-hypervisor.inc
require xen-common.inc

DEPENDS:append = " qemu"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE ??= "-1"
COMPATIBLE_MACHINE = "(mx95-nxp-bsp)"
