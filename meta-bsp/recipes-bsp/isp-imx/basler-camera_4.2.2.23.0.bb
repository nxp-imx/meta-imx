# Copyright 2020-2022 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f9a729af587a4fd25a27d5638216b854"
SRC_URI[sha256sum] = "3f02daf9441c77da47d2a0fbb72734cf237082f4ded54f05b9192d202e5d5a08"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
