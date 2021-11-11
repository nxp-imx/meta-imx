# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "333aa63fa4dc16191a70ee53065ad9f2"
SRC_URI[sha256sum] = "ff62b9df3eed828c0a980e0389c8203d93dff795df69c6b260b81cf5460eb129"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof"


