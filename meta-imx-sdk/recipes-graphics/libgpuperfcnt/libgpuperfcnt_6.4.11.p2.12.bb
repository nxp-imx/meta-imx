DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "bca42f2ba27b68561d97becfd60fdfbfb0be204808b995ed8a777e156413a171"
SRC_URI[arm-wayland.sha256sum] = "ac47e421eaa3da66435b00439a0666eefe1be3d0b31c016705786e609ac6b7d6"
SRC_URI[aarch64-wayland.sha256sum] = "522f3c6898488f09063beeafc7abfeb37645da6624872cb3ee8b349492bb03a7"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
