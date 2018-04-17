DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[arm-fb.md5sum] = "26cf038d58fc5aeb2294c6adf6bf375a"
SRC_URI[arm-fb.sha256sum] = "2ce74690d43dc69fd6cbbd8ecf7e6d78ba7b6a590583635b0d97ddece86a0384"

SRC_URI[arm-wayland.md5sum] = "4ad0f57b7314c29ce99df990fe61cd39"
SRC_URI[arm-wayland.sha256sum] = "15764df9136c02fa5b1f6ec1a9816da80becb89c9a7576064e00d3a7cdc6b7bb"

SRC_URI[arm-x11.md5sum] = "279f3e31fa22521be90da3c0146873ef"
SRC_URI[arm-x11.sha256sum] = "607e5b4a3fc7fc0f1c0058d631b2e0332066adf95f33cf3d5f3da97433e9111e"

SRC_URI[aarch64-fb.md5sum] = "d78dd2dffb0ac1604eaf68c714dc56b2"
SRC_URI[aarch64-fb.sha256sum] = "91691597672f1693a5a07aef98051da1e7a2ca2d6d902241792c858a9463535f"

SRC_URI[aarch64-wayland.md5sum] = "95f4c82401595e3a24a68e727decc206"
SRC_URI[aarch64-wayland.sha256sum] = "0da967ccdc1099af33c0adb88671cabc421fd25c49b456d0ee9771ec12fb5090"

SRC_URI[aarch64-x11.md5sum] = "d901794f4df77b246bfea946baf1fe2e"
SRC_URI[aarch64-x11.sha256sum] = "9fd9bc56eb1f611f74528e5adb33c7c595a7c32520f0575542d3ffcd51dabb39"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
