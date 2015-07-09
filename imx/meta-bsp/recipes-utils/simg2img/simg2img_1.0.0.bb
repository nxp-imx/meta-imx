# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "A tool to convert Android sparse images to raw images"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b433a746dd6fe8862028b1d7fc412a4d"

DEPENDS = "zlib"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8bba5e08c3adccac57f75f4a694e579a"
SRC_URI[sha256sum] = "c823a060059bb48a58091e3f06f142e5476918bd4d48ff59beb69779c845d693"

do_install() {
    install -d ${D}${bindir}
    cp ${S}/simg2img ${D}${bindir}/
    chmod a+x ${D}${bindir}/simg2img
}
