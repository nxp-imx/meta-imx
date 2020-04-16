# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
#LICENSE = "BSD-3-Clause"
#LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"
LICENSE = "CLOSED"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6141bed04be454ebe08a219dfd9a27e3"
SRC_URI[sha256sum] = "e03e8c8e28f237c26804afbbf1499560b5897e953efd57e1cca2140ecdb1f3b1"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
