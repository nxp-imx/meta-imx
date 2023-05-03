# Copyright (C) 2022 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a394eb1ef8270a3ff5ee71a52d712d12"
SRC_URI[sha256sum] = "1939d5d8a3996b094034561e7c27338b89f8ec45c27eaf8c702fc8c7df6ef1ab"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"

