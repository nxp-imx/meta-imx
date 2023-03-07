# Copyright 2020-2022 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479" 

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f844ade45f421479c38c89196bb13d7c"
SRC_URI[sha256sum] = "aa19062f023e7811cf17e0a71e906a31ac545bb4d8508be097a2133879b8d176"

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
