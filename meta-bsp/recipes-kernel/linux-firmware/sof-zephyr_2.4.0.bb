# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2cfb54047e26300679f429791f4532fb"
SRC_URI[sha256sum] = "8563023f73d3de4c4a94ba57f3dc10f5159e6b83b3d856f842e26ccc241ebbe7"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc"
