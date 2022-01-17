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
SRC_URI[aarch64.md5sum] = "cb52f145490b511c1dffa23d372a4ffb"
SRC_URI[aarch64.sha256sum] = "e7bd4e4143d07795418395751dc7c3098d9035249cdf4cb740c206d10a049b3d"
SRC_URI[arm.md5sum] = "fe641395027e059f8c6264d22db4ac1b"
SRC_URI[arm.sha256sum] = "e36a24fb8ad73eadf767466433140dcea75e35652970c57166a4433364879442"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
