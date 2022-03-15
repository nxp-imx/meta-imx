# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "fcf2aa661e0b68c9e3f9bf2f26da65ca"
SRC_URI[aarch64.sha256sum] = "fa3e3269896dbdb9b14aa65e2d91ea795cf186b9bd11fe5b31f1e142e8e0f2ca"
SRC_URI[arm.md5sum] = "91ae6325e6ccec23140432dce1f0269a"
SRC_URI[arm.sha256sum] = "fe9884e8afee24fccbaf6fe4fa0ba881ae92590f2188fea4a37e5a8a621ec293"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
