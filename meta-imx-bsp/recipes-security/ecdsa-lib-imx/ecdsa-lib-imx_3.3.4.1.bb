# Copyright (C) 2019-2024 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

DEPENDS = "imx-secure-enclave-seco openssl zlib"

SRC_URI[sha256sum] = "85c4b3d4b5c6262d08fab2046cb2d402a5cc117e8fac7324173009770aaae0f2"

IMX_SRCREV_ABBREV = "dd6eac8"

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
