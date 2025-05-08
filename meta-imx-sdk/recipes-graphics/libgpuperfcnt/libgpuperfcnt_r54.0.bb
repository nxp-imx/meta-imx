DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[aarch64-wayland-mali.sha256sum] = "0a6dd5d6d2c1b554b22cb6cdc9b0a67d9f2373c5468dc2f607906f10ff448648"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
