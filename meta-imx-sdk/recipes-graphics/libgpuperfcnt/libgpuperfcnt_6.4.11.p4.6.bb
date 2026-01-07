DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "5f81c19d393534c25f72ec02131ce484e95b5a77f766fbab2870b3af860a2d59"
SRC_URI[arm-wayland.sha256sum] = "996c6da8c7c0c2eeb3fc49106dafe23496c49311424eb9629fde6902f5af6105"
SRC_URI[aarch64-wayland.sha256sum] = "5e145ca1309e857f11d8a115136f8560c0e151e530b1dd5ecd6a65afeffd1ed1"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
