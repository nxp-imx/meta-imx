# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d87a348153a30f80e4b1e1db7d2fbd2f"
SRC_URI[sha256sum] = "e8dba278faa726641df0edd187e47beacd8655617f4290cd46af24a0f82a3abb"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx/sof"


