# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "a046147ff5426c2174c7afca70b5e9da"
SRC_URI[sha256sum] = "fbe8de9f6ee7e6bcdff935c56b779b9c204458f3c5f220e99f678f3d043b24a7"

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
