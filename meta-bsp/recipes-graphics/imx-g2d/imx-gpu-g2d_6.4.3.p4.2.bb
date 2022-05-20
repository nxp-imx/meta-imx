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
SRC_URI[aarch64.md5sum] = "5fc0d20df441af164e554c1db8ad80b6"
SRC_URI[aarch64.sha256sum] = "59a352f4f08c33ac2f56849f2065bac71ce7725ec94e9ba825bdd7724d77cfa2"
SRC_URI[arm.md5sum] = "c9542318adf5bf5b62f64ae4ecadb90d"
SRC_URI[arm.sha256sum] = "9c18f45543e1061d8be113496e9b06ca99fa3b125962f4ad9caa0c28e1de0070"

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
