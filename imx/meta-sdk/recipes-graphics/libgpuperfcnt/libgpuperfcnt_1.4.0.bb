DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[arm-fb.md5sum] = "f4ae62e23194767d99922b55ddb04ce9"
SRC_URI[arm-fb.sha256sum] = "5c261e2cf2893eccfdea64373e0fda739ece9bf33f3e76fd7f52850655f7c70c"

SRC_URI[arm-wayland.md5sum] = "e23396ead35406d805208d236bbc3be7"
SRC_URI[arm-wayland.sha256sum] = "408c7748b43a9b79e39eef6f6aa5f82c77ab73a470f2147892685f0591ba1d2c"

SRC_URI[arm-x11.md5sum] = "c050f5966e1ecf033ad01d58e5f12c3d"
SRC_URI[arm-x11.sha256sum] = "176c73916c23a946e660411e6fa4f7f5896fc89dffbc01173c1deaf707ecf54a"

SRC_URI[aarch64-fb.md5sum] = "f6aad9893c50ef9837663ac7f338a89e"
SRC_URI[aarch64-fb.sha256sum] = "fd5723b8148dce9d7b2bdd353e22863ac038c3e6d383c7cf9e71f126af3e7c73"

SRC_URI[aarch64-wayland.md5sum] = "95f4c82401595e3a24a68e727decc206"
SRC_URI[aarch64-wayland.sha256sum] = "0da967ccdc1099af33c0adb88671cabc421fd25c49b456d0ee9771ec12fb5090"

SRC_URI[aarch64-x11.md5sum] = "96b27c70ca68c593a99b435fae0f24c9"
SRC_URI[aarch64-x11.sha256sum] = "cbb51115ae5ee33633389c1cd623efcaa120d300f56423dc59f5217332789750"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
