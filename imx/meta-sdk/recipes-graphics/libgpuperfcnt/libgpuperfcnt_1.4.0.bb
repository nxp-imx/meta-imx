DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "167e974602e9393a8895c5c2cf8b5be3"
SRC_URI[arm-fb.sha256sum] = "14dc192917fda5c3a0b5dad5f3604ac1205704631d0ea0b6ae79720e6404e28d"

SRC_URI[arm-wayland.md5sum] = "572979637d78172c960d48bc3cb04b0b"
SRC_URI[arm-wayland.sha256sum] = "b2a9ac5462528c33f2138682814d7ff372961d48a83cc397e87f47cee0d84d55"

SRC_URI[arm-x11.md5sum] = "4814a02a44516946c0b9fb01aa03e844"
SRC_URI[arm-x11.sha256sum] = "e4fb55c35f3f67db9df9f375e3c1c57316cf7a832303fb960e1b9a14c6999ee6"

SRC_URI[aarch64-fb.md5sum] = "5861f246938785ebca75201a6e4a2d3d"
SRC_URI[aarch64-fb.sha256sum] = "a1ffab1a74bacbc62dd3b095c22b1b3c1ef09b8a223e5014db2b4693d908f029"

SRC_URI[aarch64-wayland.md5sum] = "a1bf48ac79887e923d1bbb223906203b"
SRC_URI[aarch64-wayland.sha256sum] = "c8a6c6bceebf6654b183c53d6570aebbaa16719762f905a3f77d417e17a08609"

SRC_URI[aarch64-x11.md5sum] = "b4a336f74298228c41a8166724c4410f"
SRC_URI[aarch64-x11.sha256sum] = "567cdcc813962c87d545a11022de17de50ab37335cdffcf80ee53736f83945fa"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
