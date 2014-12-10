# Copyright (C) 2014 Freescale Semiconductor

DESCRIPTION = "Set of tools to trace OpenGL OpenGL ES,Direct3D and DirectDrawAPIs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://usr/share/doc/apitrace/LICENSE.txt;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "imx-gpu-viv"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/imx-gpu-viv-5.0.11.p4.1-hfp.bin;fsl-eula=true"
SRC_URI[md5sum] = "80d60c6da13cc685cf16ac463a5bbf87"
SRC_URI[sha256sum] = "7c7005c3eb6b9887a1760c5549c35ecdf2b804f8805ff93291c44a4034c60fbe"

S = "${WORKDIR}/imx-gpu-viv-5.0.11.p4.1-hfp/apitrace"

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
