# Copyright (C) 2020-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=b66f32a90f9577a5a3255c21d79bc619"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47adc03c1f20213ffd4211404bf024be"
SRC_URI[sha256sum] = "714b3328e1456e47086dc98b642f1c5741249e625d01cdbb7a2c1e2b5f7aaa3b"

inherit allarch

do_install() {
    # Install sof and sof-tplg folder
    install -d ${D}${nonarch_base_libdir}/firmware/imx/
    cp -r sof* ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx"

