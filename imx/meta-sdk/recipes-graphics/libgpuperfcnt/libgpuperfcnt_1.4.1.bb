DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[arm-fb.md5sum] = "8f8dd9b7854fafda153da8022c30e753"
SRC_URI[arm-fb.sha256sum] = "d1073d1543050370e851b6cd24a90d1d281176f4265cae9764cff9f9520863fe"

SRC_URI[arm-wayland.md5sum] = "4ad0f57b7314c29ce99df990fe61cd39"
SRC_URI[arm-wayland.sha256sum] = "15764df9136c02fa5b1f6ec1a9816da80becb89c9a7576064e00d3a7cdc6b7bb"

SRC_URI[arm-x11.md5sum] = "f410c3f828939829a284122597d60277"
SRC_URI[arm-x11.sha256sum] = "39df19dca277537fd398c28433838c6fcdf7f8979171435fb263b5c1757cae23"

SRC_URI[aarch64-fb.md5sum] = "d78dd2dffb0ac1604eaf68c714dc56b2"
SRC_URI[aarch64-fb.sha256sum] = "91691597672f1693a5a07aef98051da1e7a2ca2d6d902241792c858a9463535f"

SRC_URI[aarch64-wayland.md5sum] = "87b563407e299accbba2b9d0727e01a3"
SRC_URI[aarch64-wayland.sha256sum] = "17cd8f92b92a132b94b1de4b801d9ba168af4dba4412995ce539d1a3040951df"

SRC_URI[aarch64-x11.md5sum] = "d901794f4df77b246bfea946baf1fe2e"
SRC_URI[aarch64-x11.sha256sum] = "9fd9bc56eb1f611f74528e5adb33c7c595a7c32520f0575542d3ffcd51dabb39"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
