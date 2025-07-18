# Copyright 2020-2024 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"

IMX_SRCREV_ABBREV = "dd86758"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI[sha256sum] = "c7ebbf04024b9125e71248f377ffb35adcebe7f439372bca86a70fcd1b1aa41f"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
