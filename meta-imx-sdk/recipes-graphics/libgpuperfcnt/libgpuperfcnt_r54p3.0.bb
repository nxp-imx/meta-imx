DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[aarch64-wayland-mali.sha256sum] = "b846f8d75019bdf3c77faa059df241a380e250792daffbb271e96a43d42452d0"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxmali)"
