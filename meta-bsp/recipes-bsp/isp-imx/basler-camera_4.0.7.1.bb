# Copyright 2020 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "1e136961f5f7e42d70e1bffedce2ebe6"
SRC_URI[sha256sum] = "09ab0fe4668938dd5e02f2803fd4fa571f2558cecbd83b281886a1584e35f1c3"

do_install() {
    dest_dir=${D}/opt/imx8-isp/bin
    install -d ${D}/${libdir}
    install -d $dest_dir
    cp -r ${S}/opt/imx8-isp/bin/* $dest_dir
    cp -r ${S}/usr/lib/* ${D}/${libdir}
}

FILES_${PN} = "${libdir} /opt"

INSANE_SKIP_${PN} = "file-rdeps already-stripped"