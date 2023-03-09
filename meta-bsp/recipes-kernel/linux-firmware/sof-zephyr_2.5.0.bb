# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1daa544dc51457f726b50d09b66f262"
SRC_URI[sha256sum] = "a4332dedc74eaa0f291af4818b6d9234d8fee7b8839885578aa7a8525b24d421"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc"
