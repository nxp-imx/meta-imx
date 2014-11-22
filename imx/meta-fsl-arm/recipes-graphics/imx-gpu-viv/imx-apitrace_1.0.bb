# Copyright (C) 2014 Freescale Semiconductor

DESCRIPTION = "Set of tools to trace OpenGL OpenGL ES,Direct3D and DirectDrawAPIs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://usr/share/doc/apitrace/LICENSE.txt;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "imx-gpu-viv"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/imx-gpu-viv-5.0.11.p4.01-hfp.bin;fsl-eula=true"
SRC_URI[md5sum] = "5f17f19b2d6309e98bbd5a8d15f6ebc8"
SRC_URI[sha256sum] = "3a45088ac791cdc7a25835d9a4a3309eea3064024436cf2cddec0eef60574883"

S = "${WORKDIR}/imx-gpu-viv-5.0.11.p4.01-hfp/apitrace"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${bindir}

    cp -axr ${S}/usr/lib/* ${D}${libdir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
}

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/*/.debug"

COMPATIBLE_MACHINE = "(mx6)"
