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
SRC_URI[aarch64.md5sum] = "f5f1cdbd17f6ccf83c3a490c7fd48bc0"
SRC_URI[aarch64.sha256sum] = "252d9101a1cf90d413bd3af29184f07fec2deba1edc8117cf83c55e6955de4b3"
SRC_URI[arm.md5sum] = "28229b4c4b9aeb955b6f9f89485018f0"
SRC_URI[arm.sha256sum] = "8c0a9899c6cc05113fe48eb82d22184b18ee5cc653357750b3ebb3d4d87753b2"

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
