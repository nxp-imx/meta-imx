# Copyright 2020-2023 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

inherit fsl-eula-unpack

SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}.bin;fsl-eula=true"

SRC_URI[sha256sum] = "f95c9aec0b2369a6df74bb20ba9504d671ce7886ec0213cfd88da45c53dbd363"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
