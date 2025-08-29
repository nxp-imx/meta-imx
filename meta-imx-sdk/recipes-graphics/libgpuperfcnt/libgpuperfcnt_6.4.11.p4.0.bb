DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "1444f1bd143fcdc587941ead299d6deb3d5ad9104ad9545f878c92ae20d1a33c"
SRC_URI[arm-wayland.sha256sum] = "03d09fc6e39c6864c497d5fdd99328e8aaeeddaab856826d4c7b4cd375c03c6f"
SRC_URI[aarch64-wayland.sha256sum] = "d9377bc88eed626764aade948b32300fa04174dbe7eda106cc95d0d51d6d2ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
