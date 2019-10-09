# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true "

SRC_URI[md5sum] = "884112064d501d70d5b8210a51ff263b"
SRC_URI[sha256sum] = "09ed8aaa88f465c7ee7cbf561019dd1a99e22df10e8b68c438dd00d00a51157c"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_imx8qxpC0mek = "mx8qxc0-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8qm|mx8x)"
