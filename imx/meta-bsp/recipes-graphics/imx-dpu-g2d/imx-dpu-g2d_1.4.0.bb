# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx8"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

RDEPENDS_${PN} = "libgal-imx"

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "8646b254dd440bb4793035eb41baade8"
SRC_URI[sha256sum] = "e9b3d44e8c48d62ea289297d86ea5d3f0910c033d1ee8c62ce947d248c146f6f"

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
