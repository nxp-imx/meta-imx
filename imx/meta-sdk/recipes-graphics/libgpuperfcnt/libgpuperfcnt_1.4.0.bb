DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "167e974602e9393a8895c5c2cf8b5be3"
SRC_URI[arm-fb.sha256sum] = "14dc192917fda5c3a0b5dad5f3604ac1205704631d0ea0b6ae79720e6404e28d"

SRC_URI[arm-wayland.md5sum] = "572979637d78172c960d48bc3cb04b0b"
SRC_URI[arm-wayland.sha256sum] = "b2a9ac5462528c33f2138682814d7ff372961d48a83cc397e87f47cee0d84d55"

SRC_URI[arm-x11.md5sum] = "4814a02a44516946c0b9fb01aa03e844"
SRC_URI[arm-x11.sha256sum] = "e4fb55c35f3f67db9df9f375e3c1c57316cf7a832303fb960e1b9a14c6999ee6"

SRC_URI[aarch64-fb.md5sum] = "72c679c4c7fd62ba0befbe3c1ffa2518"
SRC_URI[aarch64-fb.sha256sum] = "c5f2abe51cb4273eee8888d8e70bbd57b355a8861b93e38c5c2bb2004315b79d"

SRC_URI[aarch64-wayland.md5sum] = "a1bf48ac79887e923d1bbb223906203b"
SRC_URI[aarch64-wayland.sha256sum] = "c8a6c6bceebf6654b183c53d6570aebbaa16719762f905a3f77d417e17a08609"

SRC_URI[aarch64-x11.md5sum] = "4e298d52cbe1b0dda92521180da16ae6"
SRC_URI[aarch64-x11.sha256sum] = "cfbfc7211c29de63ceed24802ec6c2a2934210a81702fcf188533d6d8af3599a"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
