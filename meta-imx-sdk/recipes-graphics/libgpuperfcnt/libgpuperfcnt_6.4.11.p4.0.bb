DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "a4ee432abc1ae31c07238a52a6f57af203a2f1a544b23a4635bdafe28b3e7bfb"
SRC_URI[arm-wayland.sha256sum] = "e82d8f560ae3c1d93a3c72a2ee3dfcbf71ed8577d15cd408739ba1418fea5df6"
SRC_URI[aarch64-wayland.sha256sum] = "d9377bc88eed626764aade948b32300fa04174dbe7eda106cc95d0d51d6d2ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
