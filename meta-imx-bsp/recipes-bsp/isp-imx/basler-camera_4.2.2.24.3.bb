# Copyright 2020-2024 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837"

IMX_SRCREV_ABBREV = "d1f506a"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI[sha256sum] = "1fc544bd450328ecfcc84cedac917919e3dfb5b4175eebefd43de9deedb13ca7"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
