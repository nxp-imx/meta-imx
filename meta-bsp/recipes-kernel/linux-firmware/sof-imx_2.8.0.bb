# Copyright (C) 2020-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f27c3d3a8c4ab585c2f279ae8e466b03"
SRC_URI[sha256sum] = "6cb94afda9d0e9e39afc06f2524f01f291e6a49ca89a2af72765ffc171f627ce"

inherit allarch

do_install() {
    # Install sof and sof-tplg folder
    install -d ${D}${nonarch_base_libdir}/firmware/imx/
    cp -r sof* ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx"

