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
SRC_URI[aarch64.md5sum] = "5f1b6f9f0e1a3836b168d1249e48859a"
SRC_URI[aarch64.sha256sum] = "c4bedf65ff117f2b40caf3fbd1060ffbf740bd47afbba86817c66161b8298781"
SRC_URI[arm.md5sum] = "6f1e8da4b6a67d8071d5a2d8722ea829"
SRC_URI[arm.sha256sum] = "4869c70a82afbb787889ea317335370e9e1ab030204a5cd42dc057e1503c328a"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
