# Copyright 2020 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "a1ef5e43a1ca647887413f96225c5da1"
SRC_URI[sha256sum] = "a3982188c9d18c9990e40a6efc73778d274dcdbc8a1b743d27598967252abd83"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

FILES_${PN} = "${libdir} /opt"

INSANE_SKIP_${PN} = "file-rdeps already-stripped"