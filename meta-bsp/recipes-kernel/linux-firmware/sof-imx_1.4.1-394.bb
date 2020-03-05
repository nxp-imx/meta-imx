# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"

SRC_URI = "https://github.com/${BPN}/sof/releases/download/v${PV}/${P}.tar.gz"
SRC_URI[md5sum] = "621f3a7ab1462451e1ce8b1587be02a5"
SRC_URI[sha256sum] = "21dda4475b5c1e8e94ed553d84a1f1e5ed3c39bffae422f00312eb9872944038"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
