DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[aarch64-wayland-mali.sha256sum] = "2f0216199f48deeaa9c46e78b2d2fde8da3ff6ee2ccc5c7e0eaa2523695f8e3c"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
