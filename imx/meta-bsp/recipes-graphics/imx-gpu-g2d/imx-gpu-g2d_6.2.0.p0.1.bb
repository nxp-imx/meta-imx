# Copyright (C) 2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx6"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=102094e9e695888c6a9f9fda9004165d"

PROVIDES += "virtual/libg2d"
RPROVIDES_${PN} += "virtual/libg2d"

SRC_URI = "${MX8_DOWNLOADS}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "709d6e86e833385708f1da34be3b9a0a"
SRC_URI[sha256sum] = "0566c8544bf3268b3a03c6450293b8fd3960ca53a81fb5b9f4eb8c56a1045fa6"

do_install () {

    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${includedir}"

COMPATIBLE_MACHINE = "(mx6|mx7ulp)"
