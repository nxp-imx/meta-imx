# Copyright 2020 NXP

DESCRIPTION = "i.MX Verisilicon Software ISP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "b855b8714ac2134bde29f6be32223543"
SRC_URI[sha256sum] = "3d86ae85f5fbeb08adb19c2e72ec70fb757b1712976acd611cf92dcb3a8aad79"

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
