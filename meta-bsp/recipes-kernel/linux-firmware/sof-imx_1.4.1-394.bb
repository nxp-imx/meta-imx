# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
#LICENSE = "BSD-3-Clause"
#LIC_FILES_CHKSUM = "file://sof/LICENCE;md5=68c46ea34f5c3ef3b365178368d84a18"
LICENSE = "CLOSED"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "180bd55dc0a9f53734b5feba50871a04"
SRC_URI[sha256sum] = "863973126fdb5b166f67fc9ac4ce21c336ba25061d3ec8a342715892e259f753"

inherit allarch

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware/imx/
	cp -r * ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
