# Copyright (C) 2019-2024 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

DEPENDS = "imx-secure-enclave-seco openssl zlib"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[sha256sum] = "5d3776fa8d709289f607bdef6046fd54e0e00a6cf3becb5b14173ab0a84e7372"

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

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp)"
