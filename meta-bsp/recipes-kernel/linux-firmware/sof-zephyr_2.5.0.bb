# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a22d687efec9993ebd95aa618597e083"
SRC_URI[sha256sum] = "6af1e4433f9040c5e150a7894102ae4103d90f12c1806d725514950cce1cd24f"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc"
