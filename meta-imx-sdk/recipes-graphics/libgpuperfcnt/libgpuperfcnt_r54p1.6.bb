DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[aarch64-wayland-mali.sha256sum] = "27c29e2ae2d95c206f496ce0151555770a1e8bfb3b7dc31fd8afe5b7f0fd55bf"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
