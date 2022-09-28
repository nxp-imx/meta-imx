# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "a2314e9c92908b79c72f1e6fcc0d11e0"
SRC_URI[aarch64.sha256sum] = "5aadc597dba6a9228464cc97fc12defc4b5831910d825f69c584e3c788e5c381"
SRC_URI[arm.md5sum] = "f6bbadfaaa92e4ddbc3d9e244713ed3d"
SRC_URI[arm.sha256sum] = "390cb9b60c81f95eb7e58fb7955ab0ab580115022907fba33a62f9e0808800f4"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

IMX_SOC               = "IMX_SOC_NOT_SET"
IMX_SOC:mx8mm-nxp-bsp = "mx8mm"

do_install () {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    cp -d ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    if [ -d ${S}/g2d/usr/lib/${IMX_SOC} ]; then
        cp -df ${S}/g2d/usr/lib/${IMX_SOC}/*.so* ${D}${libdir}
    fi
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
}

INSANE_SKIP:${PN} = "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
