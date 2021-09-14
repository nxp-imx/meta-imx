# Copyright (C) 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0f00d99239d922ffd13cabef83b33444"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f0cf40f11ebe93cd80cdca684092818"
SRC_URI[sha256sum] = "7e993a2e94c229d638a29f03a27e0237faeeacf6a1cbe42db035cf1dd1383ec3"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof
    cp -r imx/sof/* ${D}${nonarch_base_libdir}/firmware/imx/sof
}

FILES_${PN} = "${nonarch_base_libdir}/firmware/imx/sof"


