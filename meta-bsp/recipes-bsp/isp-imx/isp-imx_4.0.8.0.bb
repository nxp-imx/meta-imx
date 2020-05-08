# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "551790d0a10c777c8f2334aa1516fea8"
SRC_URI[sha256sum] = "93da7302bd50c495469374932dabb6c5a521c3144b222bfee4eb5a6ee2d07972"

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