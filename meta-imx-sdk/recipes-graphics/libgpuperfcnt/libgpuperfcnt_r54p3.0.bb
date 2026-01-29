DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[aarch64-wayland-mali.sha256sum] = "8796ddf223cf0e187d7565e2e7d68aa4a277ec3d6a7bc502a1f039ff1056fa12"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
