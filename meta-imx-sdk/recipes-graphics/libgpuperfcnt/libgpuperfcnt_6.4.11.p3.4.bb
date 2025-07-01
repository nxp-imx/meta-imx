DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "a4ee432abc1ae31c07238a52a6f57af203a2f1a544b23a4635bdafe28b3e7bfb"
SRC_URI[arm-wayland.sha256sum] = "8c58f90889efddc9173e1d63ae91ce236d6c9f7647691645050718e7873eb8e0"
SRC_URI[aarch64-wayland.sha256sum] = "8913cfe875b30004d7d69e05da2b1598d941adbc397615d05f2bb9ab4b381d8c"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
