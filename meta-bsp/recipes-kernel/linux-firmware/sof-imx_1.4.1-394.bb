# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
#LICENSE = "BSD-3-Clause"
#LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"
LICENSE = "CLOSED"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f07dd4e9fd15829d8652272bc25b1dd9"
SRC_URI[sha256sum] = "e981cb6f5993da180c50aee77769e86ba381d28779e27556ab0e4fcbc46c0f5f"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
