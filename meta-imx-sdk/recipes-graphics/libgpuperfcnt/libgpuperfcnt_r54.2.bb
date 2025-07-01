DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[aarch64-wayland-mali.sha256sum] = "b612064de7ddd8e58bf653d2195f2ba95caf9dca18527b5baa26fb716eb97ffd"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
