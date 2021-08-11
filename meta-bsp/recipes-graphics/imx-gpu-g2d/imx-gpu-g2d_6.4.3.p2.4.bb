# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for i.MX with 2D GPU and no DPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa" 

DEPENDS += "libgal-imx"
PROVIDES += "virtual/libg2d"

FSLBIN_NAME     = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "4c6d07d9e0547dabea4804f5670fdc7c"
SRC_URI[aarch64.sha256sum] = "4707bac227d857dce6e58e7b90b272056e9a301afe23138cd861d5dbcbedbda5"
SRC_URI[arm.md5sum] = "bbe2e419ce5d25e00e14bb779fcb67af"
SRC_URI[arm.sha256sum] = "8ec86361754e93f18ea3fc4aa6189cd6851ea3ac0c792968c77f8a3e5cc47afa"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

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

RDEPENDS_${PN} = "libgal-imx"

COMPATIBLE_MACHINE = "(imxgpu2d)"
