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
SRC_URI[aarch64.md5sum] = "59253af09f543e5811cb9950af664965"
SRC_URI[aarch64.sha256sum] = "661cc04c0049e7c8fa0ad4113b5a3a92b452ab8152da59dea11fcd8cf960690f"
SRC_URI[arm.md5sum] = "caac7225bb91c7ee705755375892e59d"
SRC_URI[arm.sha256sum] = "28a25bf8659cb25a018b727ef47fae0f0ed100deebbb7eeac548b4be92ac41de"

S = "${WORKDIR}/${FSLBIN_NAME}"

inherit fsl-eula-unpack

do_install () {
    cp -r -d --no-preserve=ownership ${S}/g2d/* ${D}
}

INSANE_SKIP:${PN} += "ldflags"

COMPATIBLE_MACHINE = "(imxgpu2d)"
