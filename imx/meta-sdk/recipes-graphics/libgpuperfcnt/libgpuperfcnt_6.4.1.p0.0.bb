DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "a534e14beac35251a997fc4879c87f84"
SRC_URI[arm-fb.sha256sum] = "0d1c2e95c7f10bbe8e885659aea50d6564f1ec28bae3ecd3e35acf9a5b99c5ed"

SRC_URI[arm-wayland.md5sum] = "acff31a0a06a0348040fd97fd0f6efbc"
SRC_URI[arm-wayland.sha256sum] = "fb25a9df4ca0e840c6b17659cbdd1e47aacf564f4440bbfd28443bd6262d9c02"

SRC_URI[arm-x11.md5sum] = "11ad474067f5564620916353e0ee24bd"
SRC_URI[arm-x11.sha256sum] = "55ccb0751a68369176fe3fc6186c44595913d1c797e1aed1ee86455e5a348658"

SRC_URI[aarch64-fb.md5sum] = "038ea9008ae4dfd3bde5f3b75398a733"
SRC_URI[aarch64-fb.sha256sum] = "0e8c7560349ed385ff0608924238e352cfa51d7f1c9cd9b8604764db0e703577"

SRC_URI[aarch64-wayland.md5sum] = "06a67853d95daf732e6a240c746f7c7f"
SRC_URI[aarch64-wayland.sha256sum] = "17ef245cd0fdec599eaac52e8e42f1f52b00a49fcdd34a1244d5da610c3d044d"

SRC_URI[aarch64-x11.md5sum] = "20adf4568c6e937778496459299818eb"
SRC_URI[aarch64-x11.sha256sum] = "93c31859de0e1c32c7b93a023d419d10d13a8b21c732f6800c6a2d82f8f112c7"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
