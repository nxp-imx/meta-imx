# Copyright (C) 2014 Freescale Semiconductor

DESCRIPTION = "Set of tools to trace OpenGL OpenGL ES,Direct3D and DirectDrawAPIs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://usr/share/doc/apitrace/LICENSE.txt;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "imx-gpu-viv"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/imx-gpu-viv-5.0.11.p4.01-hfp.bin;fsl-eula=true"
SRC_URI[md5sum] = "06fdd15982010627fdcae6c52fbecb4e"
SRC_URI[sha256sum] = "2055754f1fbc9fb71e02dbe93c4f4101cec2126b1663a147fe2c769e34079d63"

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
