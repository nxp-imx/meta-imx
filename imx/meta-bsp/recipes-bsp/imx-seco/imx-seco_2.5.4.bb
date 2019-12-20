# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "52f71d8965e99cd162a91a326e2e5dd8"
SRC_URI[sha256sum] = "552076de1dfcf880bf1ccf208ad646dee0f32454bf4f620f71b8699c95ccb96e"

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
