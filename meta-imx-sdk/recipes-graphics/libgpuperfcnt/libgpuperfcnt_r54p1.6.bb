DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "ede1e10"

SRC_URI[aarch64-wayland-mali.sha256sum] = "e588dad9f7cd121981e3366a0a1904a368fec0c5c4a0b52acd456d5f6aaafb37"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
