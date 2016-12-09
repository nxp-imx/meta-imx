# Copyright (C) 2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx6"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"

PROVIDES += "virtual/libg2d"
RPROVIDES_${PN} += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "8629d0580d49a8ea013b6117b3329ef0"
SRC_URI[sha256sum] = "815bffeee8112f2dbcdb01a871a4139bb4c880ae5328a63ac88a12ee3da6dfe7"

do_install () {

    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${includedir}"
INSANE_SKIP_${PN} = "ldflags"

COMPATIBLE_MACHINE = "(mx6|mx7ulp)"
