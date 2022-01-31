# Copyright 2019-2022 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "Firmware for i.MX SECO Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "cdcf52069dd601667f5e1e1b6f4e8553"
SRC_URI[sha256sum] = "c64c79b5bf61821626176dbbe050a31e44b9d248c32e4bf84650f616ffd3c994"


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
