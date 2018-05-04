# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx6 and imx7ulp"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

DEPENDS += "libgal-imx"
PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "4ba4754c671bb447f530b9af4476b8fa"
SRC_URI[sha256sum] = "9d98cf38f408d3d54072bf06c235f1e20644260ae7044f38bdbfe27e8e2cdfab"

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
