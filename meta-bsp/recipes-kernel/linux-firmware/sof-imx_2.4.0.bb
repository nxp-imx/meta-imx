# Copyright (C) 2020-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b5804f6bfdd57b17e411bd8f7d907cf"
SRC_URI[sha256sum] = "9dd7f0966d4f1f0c2b8733c996f7783b2bea0ffad04c3f99f8723f84acadb1e5"

inherit allarch

do_install() {
    # Install sof and sof-tplg folder
    install -d ${D}${nonarch_base_libdir}/firmware/imx/
    cp -r sof* ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx"

