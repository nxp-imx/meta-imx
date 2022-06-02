# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2022 NXP
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "G2D library using i.MX GPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5" 
DEPENDS = "libgal-imx"
PROVIDES = "virtual/libg2d"

FSLBIN_NAME = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI = "${FSL_MIRROR}/${FSLBIN_NAME}.bin;name=${TARGET_ARCH};fsl-eula=true"
SRC_URI[aarch64.md5sum] = "bf2a4e45835863f0563760fc8a1b7d58"
SRC_URI[aarch64.sha256sum] = "ff50ddfee2d989798a2aba84ef9114e01f8d867293891dc0aacfab1640cbf8a3"
SRC_URI[arm.md5sum] = "dd216c48095dbf8017ad87cba98d94d7"
SRC_URI[arm.sha256sum] = "07107beeff364e6afdba89714a895304c7b52b1d2264e34f3a56015fecb2b20e"

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
