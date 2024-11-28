# Copyright (C) 2022-2024 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "665077213d7211c299797e0bd53be50cdc48a7a6a62380735390f0da0fb08b92"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch already-stripped"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"
