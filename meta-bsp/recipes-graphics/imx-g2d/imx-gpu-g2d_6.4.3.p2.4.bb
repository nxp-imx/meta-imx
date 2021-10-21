# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "f399b5a50cdf60b5ff8d4c953766be17"
SRC_URI[aarch64.sha256sum] = "74ee0f6ea8017b7b94317eb21e6bc4f938e4e7dcd2df0f0409171e091e4a287f"
SRC_URI[arm.md5sum] = "0f0e49f956b6426a5abf0dfba6aa9cec"
SRC_URI[arm.sha256sum] = "f09662ff0a90c15ef3994907309a90fb1f7a3fae1fa9be7347ff216e31ef63c5"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
