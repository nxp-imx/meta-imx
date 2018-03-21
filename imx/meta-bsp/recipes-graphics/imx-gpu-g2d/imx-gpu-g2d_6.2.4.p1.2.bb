# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx6"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

DEPENDS += "libgal-imx"
PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "53fd6cbfdfa06733f86723b65acce7dd"
SRC_URI[sha256sum] = "03918da3f3b0ec2370c4f81f6fbca950428a29d6a273f73738e5891c555b475f"

do_install () {

    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

RDEPENDS_${PN} = "libgal-imx"

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${includedir}"
INSANE_SKIP_${PN} = "ldflags"

# Compatible only with i.MX DPU-blit
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxdpublit = "${MACHINE}"
