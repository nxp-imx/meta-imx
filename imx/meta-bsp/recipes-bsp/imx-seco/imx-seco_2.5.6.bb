# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "b0e0e358f02b7030b57f9eca6a22cf3d"
SRC_URI[sha256sum] = "e18ce97a7ae0878c708393c6e65aaad86508d642ef4fd1b3ad9930287cc96294"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_imx8qxpc0mek = "mx8qxc0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8dxl-phantom = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_imx8qxpc0lpddr4arm2 = "mx8qxc0-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8qm|mx8x)"
