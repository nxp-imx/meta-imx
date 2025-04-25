# Copyright 2020-2024 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

IMX_SRCREV_ABBREV = "d1f506a"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI[sha256sum] = "354189a4acf54808669c85bc1cad89da00d2ac3a0365e0b429749b95dff08e84"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
