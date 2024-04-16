# Copyright 2024 NXP
HOMEPAGE = "http://xen.org"
LICENSE = "GPL-2.0-only"
SECTION = "console/tools"
LIC_FILES_CHKSUM ?= "file://COPYING;md5=d1a1e216f80b6d8da95fec897d0dbec9"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE ??= "-1"
DEPENDS:apennd = "qemu"
require recipes-extended/xen/xen.inc
require recipes-extended/xen/xen-tools.inc
require xen-common.inc

FILES:${PN}:append = " \
    ${sysconfdir}/xen/*.conf \
    ${libdir}/xen/bin/xen-9pfsd \
"
