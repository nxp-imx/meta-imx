# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true "

SRC_URI[md5sum] = "8a99e4616f466766b5a1a77e39e80c34"
SRC_URI[sha256sum] = "dce58a4db6db86417be0a1f61a77800318495bdb25b9b9c5e66676fe0d1c5fcc"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qm-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qm-ahab-container.img"
SECO_FIRMWARE_NAME_mx8x   = "mx8qx-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8x)"
