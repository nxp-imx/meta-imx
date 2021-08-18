# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "868e1f276eb23be659b997ef7c0dc1e1"
SRC_URI[sha256sum] = "095b3e87cc7e798f9a322d358bd4a9aa9a9b1dd5d1bc451e8260652cd18cc8eb"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof
    cp -r sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx/sof"


