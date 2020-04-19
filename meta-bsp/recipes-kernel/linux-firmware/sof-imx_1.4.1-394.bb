# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
#LICENSE = "BSD-3-Clause"
#LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"
LICENSE = "CLOSED"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d883dd53031126a2138e6d368650d3ba"
SRC_URI[sha256sum] = "aae06c00b9a36ab5cc5eb26693409602d8d9d479df3c215d941a037d0474ea94"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
