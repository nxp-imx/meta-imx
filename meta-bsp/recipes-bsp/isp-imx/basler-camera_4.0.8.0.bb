# Copyright 2020 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "b2b9a8bc3f0be795471ccb25ff997818"
SRC_URI[sha256sum] = "739d946b70f1f070677956a171602f9452c14d3839dc71f36e0036b7d107c47f"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

FILES_${PN} = "${libdir} /opt"

INSANE_SKIP_${PN} = "file-rdeps already-stripped"