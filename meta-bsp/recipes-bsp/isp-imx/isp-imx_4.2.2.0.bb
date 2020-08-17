# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "d2744751db27b00385410b63a44d6a29"
SRC_URI[sha256sum] = "587a6d8760069fb1311a6f99e0aa7678f4a42e30a0ea4d5a4768d9bb1290f63d"

do_install() {
    install -d ${D}/${libdir}
    install -d ${D}/${includedir}
    install -d ${D}/opt/imx8-isp/bin
    cp -r ${S}/opt/imx8-isp/bin/* ${D}/opt/imx8-isp/bin
    cp -r ${S}/usr/lib/* ${D}/${libdir}
    cp -r ${S}/usr/include/* ${D}/${includedir}
}

RDEPENDS_${PN} = "libdrm libpython2"

PACKAGES = "${PN} ${PN}-dev ${PN}-dbg"

FILES_${PN} = "${libdir} /opt"
FILES_${PN}-dbg += "${libdir}/.debug"

INSANE_SKIP_${PN} += "rpaths dev-deps dev-so"
INSANE_SKIP_${PN}-dev += "rpaths dev-elf"
