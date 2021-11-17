# Copyright 2019-2021 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "NXP IMX SECO firmware"
SECTION = "base"
LICENSE = "Proprietary"

LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "e365145072671bc2c5dab3e2f86ff195"
SRC_URI[sha256sum] = "6e54414ba16308a799d1cd1649a8f9c8c090d5f04a9632e138a51d2a0bbd52bb"

do_compile[noexec] = "1"

do_install() {
}

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE:mx8m = "(^$)"
