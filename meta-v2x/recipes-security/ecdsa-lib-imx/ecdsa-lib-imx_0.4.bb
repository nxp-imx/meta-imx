# Copyright (C) 2021 NXP

DESCRIPTION = "ECDSA Verification Engine using HSM"
SUMMARY = "ECDSA Verification Engine using HSM"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

DEPENDS = "imx-seco-libs"

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "2d0309d2dd3dc20cde5583353f733d3a"
SRC_URI[sha256sum] = "ccee988c338b8654c02da0de8742ffdfc4d4f9610a7ba7cde880ecd9d4c8f950"

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
