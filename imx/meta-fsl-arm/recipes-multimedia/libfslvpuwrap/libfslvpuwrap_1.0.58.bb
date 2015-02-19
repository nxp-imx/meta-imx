# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Multimedia VPU wrapper"
DEPENDS = "imx-vpu"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=acdb807ac7275fe32f9f64992e111241"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "cd800dcf2cc44862f2db28916da3a13e"
SRC_URI[sha256sum] = "8c1f125fed5378fc43bc0b2b241fb2873d5e9ecedd3e83de2f52435ef2e746a4"

inherit fsl-eula-unpack autotools pkgconfig

do_install_append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}/imx-mm
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl)"
