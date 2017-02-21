# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"

inherit deploy fsl-eula-unpack

M4_PKG_NAME = "imx7ulp-m4-demo-beta"
SRC_URI = "${FSL_MIRROR}/${M4_PKG_NAME}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_PKG_NAME}"

SRC_URI[md5sum] = "466b8c0826dbd1dde6d7677bd6eaffb4"
SRC_URI[sha256sum] = "a6570a9e97c65cffb0d097fc14e1b674f969192f35a297006f7cf5a408167545"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   find ${S}/ -name "*.img" -exec cp {} ${DEPLOYDIR}/ \;
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp)"

