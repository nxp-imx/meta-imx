# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true "

SRC_URI[md5sum] = "a4abce233559d2302612db195b0a1b7e"
SRC_URI[sha256sum] = "7e73525069935c389f5aa19d3f77a4149f4e31d3f6c751cd4e198c51af032537"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qm-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qm-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp = "mx8qx-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
