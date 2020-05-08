# Copyright (C) 2020 Mihai Lindner <mihai.lindner@nxp.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "556029caa513c2390924a7a70197beb9"
SRC_URI[sha256sum] = "3057752a2c3442973f6e00c8580a6b5218e93d710f0f68de45d7b0644dac37be"

inherit allarch

do_install() {
    # Install sof and sof-tplg folder
    install -d ${D}${nonarch_base_libdir}/firmware/imx/
    cp -r sof* ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx"
