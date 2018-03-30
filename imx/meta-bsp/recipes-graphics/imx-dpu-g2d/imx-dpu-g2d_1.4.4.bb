# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx8"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

RDEPENDS_${PN} = "libgal-imx libdrm"

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "d39d952e2d62fdc774c47ebf70c6e594"
SRC_URI[sha256sum] = "45f74743c6bb8faebccfd0ec8b15179b0f8fcbb5917010e543e11af500bbdee5"

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
