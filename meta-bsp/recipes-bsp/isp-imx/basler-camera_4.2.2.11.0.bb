# Copyright 2020-2021 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "63698bf650b8f721eb99c395905c3819"
SRC_URI[sha256sum] = "9a7ae910b07d54d80c9c44dde12ce72c3f3a40cd0629145bf609aac262fde9b9"

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
