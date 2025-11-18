# Copyright 2020-2024 NXP

DESCRIPTION = "Basler camera binary drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

IMX_SRCREV_ABBREV = "dd86758"

inherit fsl-eula2-unpack2 fsl-eula-recent

SRC_URI[sha256sum] = "10b7b0e0ca6acdd4476c75b8916d2163b45ddc897bf2ec9ceb0fe4fa7cb78e98" 

do_compile[noexec] = "1"

do_install() {
    oe_runmake install INSTALL_DIR=${D}
}

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${libdir} /opt"
INSANE_SKIP:${PN} = "already-stripped"
RDEPENDS:${PN} += "isp-imx"


COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
