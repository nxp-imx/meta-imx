DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[aarch64-wayland-mali.sha256sum] = "891f571fb4b4c4b555c23a3d17a1fb8a9a57d536594ae1f2c1e6af1923718ec6"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
