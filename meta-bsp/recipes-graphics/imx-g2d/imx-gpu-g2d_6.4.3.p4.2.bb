# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "5ae8d51245afef6bb70a68961d1b4b28"
SRC_URI[aarch64.sha256sum] = "8e9c9dfd17277ae617b5b96a467849e283e00f268077e9c05624f0d7ae39f3f1"
SRC_URI[arm.md5sum] = "8f098ca1bc1bc586e30be9202c248f7e"
SRC_URI[arm.sha256sum] = "e2641c9a2f4d66b6ddb91c63fff24449d2fc21b4f776641d8a0136c84d80f160"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
