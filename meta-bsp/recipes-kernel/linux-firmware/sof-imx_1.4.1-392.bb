# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"

SRC_URI = "https://github.com/${BPN}/sof/releases/download/v${PV}/${P}.tar.gz"
SRC_URI[md5sum] = "4524001d9ddf792831d05bd2c380651d"
SRC_URI[sha256sum] = "029b4fd84264452cf20821543190826a2a8c99bcf05377e3652095164626a09c"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
