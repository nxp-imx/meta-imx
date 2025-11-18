DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "0dd6aeebeba7b765e98c65ba6f182eb1f4e3e7393e4696e1374b32ad34c953a4"
SRC_URI[arm-wayland.sha256sum] = "8000570a0cc5394b094737a4bedbdd9b362befb4be509e58d00e39d017b4d445"
SRC_URI[aarch64-wayland.sha256sum] = "8cad4996284cea9d5807f60fea9b1764572eeb808a37f103097625d760fe7bba"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
