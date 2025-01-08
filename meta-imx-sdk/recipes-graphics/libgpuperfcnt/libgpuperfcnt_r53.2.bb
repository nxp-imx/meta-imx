DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[aarch64-wayland-mali.sha256sum] = "4c0beee920dd34fd332bdd7573db942b4b222c4b9114d99ce7e078545e3bda6e"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
