# Copyright (C) 2022 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b5ff18ab8cc4c5cac86bf5413c6469a"
SRC_URI[sha256sum] = "c99c130b06c5d91cfc6a82b2c636705c284e3d4cfc43b59343cdea58bfbae78a"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"

