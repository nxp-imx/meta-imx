# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx8"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

RDEPENDS_${PN} = "libgal-imx libdrm"

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "416c701c0f793ec6cabdc90104fcc5cb"
SRC_URI[sha256sum] = "3d545fe328e012fd2a772d89f88c5243315abd00c2a04d44574fd57a50b75b65"

do_install () {

    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp -r ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

INSANE_SKIP_${PN} += "ldflags"

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${libdir}/libg2d${SOLIBSDEV} ${includedir}"

# Compatible only with i.MX DPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxdpu = "${MACHINE}"
