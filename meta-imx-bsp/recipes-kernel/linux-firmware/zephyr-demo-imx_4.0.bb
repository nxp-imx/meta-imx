# Copyright (C) 2022-2024 NXP

DESCRIPTION = "Zephyr Demo for i.MX"
HOMEPAGE = "https://github.com/zephyrproject-rtos/zephyr"
SECTION = "kernel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f562198c0123d3829f9a8dab92f09e92"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "40c6c496d45f5bb21cc282e206e2b4dfa1bae99ed5bae2333008999debf5cc21"

inherit allarch

do_install() {
    # Install zephyr hello world sample
    install -d ${D}${nonarch_base_libdir}/firmware/imx/zephyr
    cp -r *.elf ${D}${nonarch_base_libdir}/firmware/imx/zephyr
}

INSANE_SKIP:${PN} = "arch already-stripped"

FILES:${PN} += "${nonarch_base_libdir}/firmware/imx/zephyr/*.elf"
