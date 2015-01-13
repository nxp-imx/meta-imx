# Copyright (C) 2014 Freescale Semiconductor

DESCRIPTION = "Set of tools to trace OpenGL OpenGL ES,Direct3D and DirectDrawAPIs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://usr/share/doc/apitrace/LICENSE.txt;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "imx-gpu-viv"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/imx-gpu-viv-5.0.11.p4.2-hfp.bin;fsl-eula=true"
SRC_URI[md5sum] = "c7f812c6aa00f7658c7e94a69d59d5c1"
SRC_URI[sha256sum] = "8554568caa42ff99a353fb81919e7ec64f3833951770912cb261e02eba517475"

S = "${WORKDIR}/imx-gpu-viv-5.0.11.p4.2-hfp/apitrace"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${bindir}

    cp -axr ${S}/usr/lib/* ${D}${libdir}
    cp -axr ${S}/usr/bin/* ${D}${bindir}
}

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
