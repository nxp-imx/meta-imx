# Copyright 2019-2022,2024 NXP

SUMMARY = "NXP i.MX SECO firmware"
DESCRIPTION = "Firmware for i.MX Security Controller Subsystem"
SECTION = "base"
LICENSE = "Proprietary"

LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[sha256sum] = "9b04be33814a9cbda9bbfcb6711585cf7e4ed2527793813c95230f350323cba7"
IMX_SRCREV_ABBREV = "1f2f5e5"

inherit fsl-eula2-unpack2 fsl-eula-recent use-imx-security-controller-firmware deploy

do_compile[noexec] = "1"

do_install() {
}

addtask deploy after do_install
do_deploy () {
    # Deploy i.MX8 SECO firmware files
    install -m 0644 ${S}/firmware/seco/${SECO_FIRMWARE_NAME} ${DEPLOYDIR}
}

COMPATIBLE_MACHINE = "(mx8qm-generic-bsp|mx8qxp-generic-bsp|mx8dxl-generic-bsp|mx8dx-generic-bsp)"
