# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "7281bb77433839dbc1a8aea804ac1e16"
SRC_URI[aarch64.sha256sum] = "983d44e896e7368195bd54b11fc522a5c057558f8ef70200a479f898702a6835"
SRC_URI[arm.md5sum] = "045ab5816f64694a2d13c52cfee8c14b"
SRC_URI[arm.sha256sum] = "7b986c469e9d893abe4af8e921fd74b2f77a8ac77be7364d2a17eb7ac61fb083"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
    if [ "${libdir}" != "/usr/lib" ]; then
        mv ${D}/usr/lib ${D}${libdir}
    fi
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
