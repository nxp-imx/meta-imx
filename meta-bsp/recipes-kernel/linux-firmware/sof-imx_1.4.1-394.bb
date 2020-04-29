# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6312f96efd736a685735689623998fd4"
SRC_URI[sha256sum] = "1e902aa4f4c2c61f3fd960a26fa3f6a331683e7d01b0f70c189fa73d6aa048be"

inherit allarch

do_install() {
    # Install sof and sof-tplg folder
    install -d ${D}${nonarch_base_libdir}/firmware/imx/
    cp -r sof* ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
