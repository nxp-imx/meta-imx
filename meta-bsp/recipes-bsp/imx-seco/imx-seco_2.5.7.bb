# Copyright 2019 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

inherit fsl-eula-unpack deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f5039570021132b3d163633f6f509bc5"
SRC_URI[sha256sum] = "b9e97fd84914d30fe59fa499e821c11912acfa8e0a3e27db63f4a36888cbf22b"

do_compile[noexec] = "1"

do_install[noexec] = "1"

SECO_FIRMWARE_NAME ?= "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qm  = "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxpc0 = "mx8qxc0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8phantomdxl = "mx8qxb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8dxl = "mx8dxla0-ahab-container.img"

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}


COMPATIBLE_MACHINE = "(mx8qm|mx8x)"
