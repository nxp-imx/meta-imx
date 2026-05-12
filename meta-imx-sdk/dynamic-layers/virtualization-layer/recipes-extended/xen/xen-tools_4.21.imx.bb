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
    ${sysconfdir}/xen/readme.imx \
    ${sysconfdir}/xen/imx95-disk.sh \
    ${sysconfdir}/xen/imx95-domu.sh \
"

# The xen-tools-net-conf package configures systemd-networkd to create a xenbr0 bridge
# This reconfigures the network interface during boot, breaking NFS root mounts
# Only include it when NFS is not in use
RDEPENDS:${PN}:remove = "${@bb.utils.contains('DISTRO_FEATURES', 'nfs', '${PN}-net-conf', '', d)}"

INSANE_SKIP:${PN}-dbg += "buildpaths"
