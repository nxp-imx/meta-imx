# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "41782cf9e6c2ed93e4c9a7feb15cd5ce"
SRC_URI[sha256sum] = "0041fdf65bf4e5a5473271fc9a57b414acd5a00d05076351ef871005007b75b5"

do_install() {
    install -d ${D}/${libdir}
    install -d ${D}/${includedir}
    install -d ${D}/opt/imx8-isp/bin
    cp -r ${S}/opt/imx8-isp/bin/* ${D}/opt/imx8-isp/bin
    cp -r ${S}/usr/lib/* ${D}/${libdir}
    cp -r ${S}/usr/include/* ${D}/${includedir}
}

RDEPENDS_${PN} = "libdrm libpython2"

FILES_${PN} = "${libdir} /opt"

INSANE_SKIP_${PN} += "rpaths dev-deps"
INSANE_SKIP_${PN}-dev += "rpaths dev-elf"