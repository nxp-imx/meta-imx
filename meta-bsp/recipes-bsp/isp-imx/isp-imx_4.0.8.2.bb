# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "50442838d0ff01d4753a0aff244341a3"
SRC_URI[sha256sum] = "7186d7424ec427ac483a07503ae4ca9ef4c09c1afb5fc536ff529a5f83f68802"

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
