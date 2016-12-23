# Copyright (C) 2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"

inherit deploy fsl-eula-unpack

M4_PKG_NAME = "imx7ulp-m4-demo-alpha"
SRC_URI = "${FSL_MIRROR}/${M4_PKG_NAME}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_PKG_NAME}"

SRC_URI[md5sum] = "30f904bb510a8994d0ba39bed52bdda8"
SRC_URI[sha256sum] = "cb6e4af6bfe99c3fbb8afd8773de73680d4b1f2310b461bee39929e7cc12b0f4"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   find ${S}/ -name "*.img" -exec cp {} ${DEPLOYDIR}/ \;
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp)"

