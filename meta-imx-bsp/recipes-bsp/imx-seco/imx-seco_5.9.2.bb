# Copyright 2019-2022 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "Firmware for i.MX Security Controller Subsystem"
SECTION = "base"
LICENSE = "Proprietary"

LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "d5e0bba9de234e6a3a9d11f1dc3cfb00"
SRC_URI[sha256sum] = "81601f73d1b2c1d051760e6f6174e084256a1a10ed21a5c616c139e630c4e709"

do_compile[noexec] = "1"

do_install() {
}

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "(mx8qm-generic-bsp|mx8qxp-generic-bsp|mx8dxl-generic-bsp|mx8dx-generic-bsp)"
