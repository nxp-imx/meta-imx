DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "f65a566"

SRC_URI[aarch64-wayland-mali.sha256sum] = "1b28bae1c50c34201c42df88e7aa383f745a2c81738d422510b5de3e091e7e39"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
