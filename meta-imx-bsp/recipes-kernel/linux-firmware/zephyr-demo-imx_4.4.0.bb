# Copyright (C) 2022-2024 NXP
DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"
SRC_URI[sha256sum] = "3b66cf3e7c21928dfc4a6af8ad27279d4c1f7ddff97e3a1012277cf2541ea3df"

IMX_SRCREV_ABBREV = "daa15a8"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch already-stripped"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"
