# Copyright (C) 2020-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=b66f32a90f9577a5a3255c21d79bc619"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6150b2bea3a75b8c2e7f86fc849c4ae6"
SRC_URI[sha256sum] = "410ae991c7c5023ced54f8093bbebdc609c9156643efc01a4b926d0d010e1d77"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-xcc
    cp -r sof-zephyr-gcc/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    cp -r sof-zephyr-xcc/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-xcc
    # Copy symbolic link
    cp -P sof  ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof*"
