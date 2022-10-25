# Copyright (C) 2022 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "25a0674f2d04dc5adac71ef3253c5f08"
SRC_URI[sha256sum] = "5c9b1d7b00692e0ec4047beea8b92f557cbabdfaa72eab953fc8f0f108a968a8"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"

