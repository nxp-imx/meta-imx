DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "8187d1021ffe5571abc3fa3c0edbc64b2bd66f8f5bf1a11c50d23de127d0a0e4"
SRC_URI[arm-wayland.sha256sum] = "03d09fc6e39c6864c497d5fdd99328e8aaeeddaab856826d4c7b4cd375c03c6f"
SRC_URI[aarch64-wayland.sha256sum] = "43484825f8355edfef101a1ffb6bbb7d5b03552596354dc6074b3080989a3098"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
