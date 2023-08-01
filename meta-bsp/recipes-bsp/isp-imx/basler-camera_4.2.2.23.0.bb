# Copyright 2020-2023 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "d9e216efb586c041ef9e33c228cbb218"
SRC_URI[sha256sum] = "7fdbc6d24f10294ae4b71764d8df0f54659b24eb094b176a5f711108909d78c8"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
