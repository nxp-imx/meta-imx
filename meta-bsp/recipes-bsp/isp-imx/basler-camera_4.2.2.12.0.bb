# Copyright 2020-2021 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "10d156519976b5adfb6ceaefc7553b2c"
SRC_URI[sha256sum] = "c87d1b2f2ae7cb6bb6d59c577aa7b8cae46bb1bbc679dd4d34f5ac76c6afa59a"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES_${PN} = "${libdir} /opt"
INSANE_SKIP_${PN} = "file-rdeps already-stripped"

COMPATIBLE_MACHINE = "(imx|use-nxp-bsp)"
