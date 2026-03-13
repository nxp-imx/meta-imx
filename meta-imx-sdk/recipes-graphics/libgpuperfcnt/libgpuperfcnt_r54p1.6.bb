DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "abc76fa"

SRC_URI[aarch64-wayland-mali.sha256sum] = "3b34d999dca4a4b3250e8c40810b5a30a6f207e0a32af060ddc51b6b78eb675d"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
