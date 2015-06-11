# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "A tool to convert Android sparse images to raw images"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://defs.h;md5=4ede589b97ad8f0761da200678af8518"

DEPENDS = "zlib"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6ac6d26b52411aa95887e73050b1ae1"
SRC_URI[sha256sum] = "937552517907e53febdabe6a2720e391c01df9247b86a5cc3b5c31536c47ab80"

do_install() {
    install -d ${D}${bindir}
    cp ${S}/simg2img ${D}${bindir}/
    chmod a+x ${D}${bindir}/simg2img
}
