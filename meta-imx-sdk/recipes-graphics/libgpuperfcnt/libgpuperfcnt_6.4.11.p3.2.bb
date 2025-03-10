DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "f4246423d7e4c3ef236ace47916ffd28baac7577c96061be6e84f87d99c3d111"
SRC_URI[arm-wayland.sha256sum] = "174e5066216f85719d56505d288393e9745907adc2a3c671d64e5de23d75b0c2" 
SRC_URI[aarch64-wayland.sha256sum] = "674d8cfa9f23afd597eb476d9cccbd0d5dc3bfcb0192046315ddf9b1fca08b0b"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
