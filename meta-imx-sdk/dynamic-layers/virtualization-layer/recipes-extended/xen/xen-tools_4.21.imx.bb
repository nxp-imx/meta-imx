# Copyright 2024 NXP
HOMEPAGE = "http://xen.org"
LICENSE = "GPL-2.0-only"
SECTION = "console/tools"
LIC_FILES_CHKSUM ?= "file://COPYING;md5=d1a1e216f80b6d8da95fec897d0dbec9"

DEFAULT_PREFERENCE ??= "-1"

require xen-common.inc
require xen.inc
require xen-tools.inc

FILES:${PN}:append = " \
    ${sysconfdir}/xen/*.conf \
"
INSANE_SKIP:${PN}-dbg += "buildpaths"
