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

SRC_URI[md5sum] = "10f644672e0e6071189b23c537884c61"
SRC_URI[sha256sum] = "e3249c99a1afaf60dd481ee20830242b6027e4287d1f4f6fdc2c066aa4c40634"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   find ${S}/ -name "*.img" -exec cp {} ${DEPLOYDIR}/ \;
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp)"

