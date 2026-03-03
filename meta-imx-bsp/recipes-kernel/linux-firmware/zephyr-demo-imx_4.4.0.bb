# Copyright (C) 2022-2024 NXP
DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"
SRC_URI[sha256sum] = "7431c64dff997a82183f582c87fe2da2d7888e09d1977a2599d69cf02d29a633"

IMX_SRCREV_ABBREV = "28b7197"

S = "${UNPACKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch already-stripped"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"
