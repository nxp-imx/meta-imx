# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "88cd43261f5a14b5fc428c0174aefd67"
SRC_URI[aarch64.sha256sum] = "3e51ec5ed6c8444ccbd848fd7d70bf2872310940e5ba3d7d078f3526560fa920"
SRC_URI[arm.md5sum] = "1aa17af901a7a4c2da145bfadb7643fe"
SRC_URI[arm.sha256sum] = "57d37d5a70d4b4ad4f08a642ddc6e7e14a4491e2353dc35cf2ec30836350e67e"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
