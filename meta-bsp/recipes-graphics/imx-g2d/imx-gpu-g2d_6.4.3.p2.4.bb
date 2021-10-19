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
SRC_URI[aarch64.md5sum] = "37e54f264bb3fdc31dbf8547142ee35c"
SRC_URI[aarch64.sha256sum] = "ea333eb9fee85935a906dd45ad7a8e5e80d43f6fb20eeda825d10d405916dcbe"
SRC_URI[arm.md5sum] = "bf1cb6dad0aff0ec83a5605be3f1552e"
SRC_URI[arm.sha256sum] = "5c02a9bf06c71328b92e0e9e89fe3c8c0224ccbcd700e7efbedb34d39f8c21f0"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP_${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
