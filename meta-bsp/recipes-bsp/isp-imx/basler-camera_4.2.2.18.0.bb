# Copyright 2020-2021 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "f347556c26d1b0b6c51024092065f5de"
SRC_URI[sha256sum] = "9f4279523fe5d6e8ed11a9e6757e15e30e7e2199a2641192719fd4913b805675"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "file-rdeps already-stripped"

COMPATIBLE_MACHINE = "(mx8mp)"
