DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[aarch64-wayland-mali.sha256sum] = "134c7c19ccec6d3e7078495b34c2579b1abe9eefc13e2a71f3a50b32c39033c8"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
