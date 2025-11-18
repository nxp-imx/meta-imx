# Copyright (C) 2019-2025 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

DEPENDS = "imx-secure-enclave-seco openssl zlib"

SRC_URI[sha256sum] = "d95d8bf8df1ebf1af8115294758f184fed1be2a0932c49c70df545b5ff82084d"

IMX_SRCREV_ABBREV = "18480d8"

inherit fsl-eula2-unpack2 fsl-eula-recent

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

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp)"
