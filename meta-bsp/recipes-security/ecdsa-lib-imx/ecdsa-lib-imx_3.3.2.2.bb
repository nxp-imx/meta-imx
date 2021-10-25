# Copyright (C) 2019-2021 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

DEPENDS = "imx-seco-libs openssl"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "ece67b5d3a3084082ec844c8cacc70a1"
SRC_URI[sha256sum] = "ccbe40d913909f7f6557212eb840ef8a43c1f40a708e83919ed7e955d87e828d"

inherit fsl-eula-unpack

do_install(){
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    install -d ${D}${bindir}

    cp -P --no-preserve=ownership ${S}/usr/lib/* ${D}${libdir}
    cp -r --no-preserve=ownership ${S}/usr/include/* ${D}${includedir}
    cp -r --no-preserve=ownership ${S}/usr/bin/* ${D}${bindir}
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

COMPATIBLE_MACHINE = "(mx8dxl)"
