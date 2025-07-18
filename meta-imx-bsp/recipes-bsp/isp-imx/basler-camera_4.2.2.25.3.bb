# Copyright 2020-2024 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_SRCREV_ABBREV = "dd86758"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI[sha256sum] = "005776ea02572df6e91cb83bfdfb37c832387e2329f9367ed0c078a94dc0a8b2"

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
