# Copyright (C) 2019-2024 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

DEPENDS = "imx-secure-enclave-seco openssl zlib"

SRC_URI[sha256sum] = "22e2634f841de378db3e67fce698680e275d9dbf89917fe8f4ab9cb25014f001"

IMX_SRCREV_ABBREV = "e69b2b8"

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
