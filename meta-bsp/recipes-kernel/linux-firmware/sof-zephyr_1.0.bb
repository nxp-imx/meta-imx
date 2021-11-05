# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "43cafc9b9e2a73ebf19d23fdcc97734a"
SRC_URI[sha256sum] = "f7b2f8679ca72c7f6e334aac3a523ad02ff68ae20703f8156be1f470694e678f"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx/sof"


