# Copyright (C) 2022 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1dba98f5c5b842e946b7edbf69e37b4c"
SRC_URI[sha256sum] = "441597afc1c8153cc4bf5a0b8c72e6891ba69b01e157e2ff49a86ab764a7bb2b"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"

