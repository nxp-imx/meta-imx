DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"
DEPENDS = "mali-imx"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[aarch64-wayland-mali.sha256sum] = "e865e10cdf5b993127f45796ec74a2da3b1d0bf2cea147634ad39aaa0db1461d"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
