# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

inherit deploy fsl-eula-unpack

M4_PKG_NAME = "imx7ulp-m4-demo-beta"
SRC_URI = "${FSL_MIRROR}/${M4_PKG_NAME}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_PKG_NAME}"

SRC_URI[md5sum] = "1d8ee8bb4d0fdf97b206b05c904746c0"
SRC_URI[sha256sum] = "769484815a7381b7b433ab0d16620718eb80cce6e54ebd160e4422870ce30fe8"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   find ${S}/ -name "*.img" -exec cp {} ${DEPLOYDIR}/ \;
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp)"

