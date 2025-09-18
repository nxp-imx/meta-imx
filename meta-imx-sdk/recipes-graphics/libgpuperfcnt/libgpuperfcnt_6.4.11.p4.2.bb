DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "362cc8239a08cba98983d91352eafaa3f041c9e9af53710d18587a3c7749927d"
SRC_URI[arm-wayland.sha256sum] = "9b5ebe7732750449ccea24ed4e2ec8b104e2ccabdf01f05fd1d1c84212423fce"
SRC_URI[aarch64-wayland.sha256sum] = "8cad4996284cea9d5807f60fea9b1764572eeb808a37f103097625d760fe7bba"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
