DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[arm-fb.md5sum] = "f4ae62e23194767d99922b55ddb04ce9"
SRC_URI[arm-fb.sha256sum] = "5c261e2cf2893eccfdea64373e0fda739ece9bf33f3e76fd7f52850655f7c70c"

SRC_URI[arm-wayland.md5sum] = "e23396ead35406d805208d236bbc3be7"
SRC_URI[arm-wayland.sha256sum] = "408c7748b43a9b79e39eef6f6aa5f82c77ab73a470f2147892685f0591ba1d2c"

SRC_URI[arm-x11.md5sum] = "c050f5966e1ecf033ad01d58e5f12c3d"
SRC_URI[arm-x11.sha256sum] = "176c73916c23a946e660411e6fa4f7f5896fc89dffbc01173c1deaf707ecf54a"

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
