DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "ef1717b39648230b20c6a9fcd5255a50"
SRC_URI[arm-fb.sha256sum] = "716b0c2df95e6ffddab7ff9e976b26e419bf8f15522183e5bb57461f74de8188"

SRC_URI[arm-wayland.md5sum] = "e23396ead35406d805208d236bbc3be7"
SRC_URI[arm-wayland.sha256sum] = "408c7748b43a9b79e39eef6f6aa5f82c77ab73a470f2147892685f0591ba1d2c"

SRC_URI[arm-x11.md5sum] = "3c65cb9aef37c08d7ee61ad3108ae5e3"
SRC_URI[arm-x11.sha256sum] = "281f18b4485cb84c957bb60daaae78c0af59acfb2bad269148fb2dbaf9aebf7f"

SRC_URI[aarch64-fb.md5sum] = "f6aad9893c50ef9837663ac7f338a89e"
SRC_URI[aarch64-fb.sha256sum] = "fd5723b8148dce9d7b2bdd353e22863ac038c3e6d383c7cf9e71f126af3e7c73"

SRC_URI[aarch64-wayland.md5sum] = "9aae1b7d0e0da2d89428f5ba60463537"
SRC_URI[aarch64-wayland.sha256sum] = "117396172d718fd64a7f7b490ba13c9e5cc26cf0404466a857c00d0b4f0bae32"

SRC_URI[aarch64-x11.md5sum] = "96b27c70ca68c593a99b435fae0f24c9"
SRC_URI[aarch64-x11.sha256sum] = "cbb51115ae5ee33633389c1cd623efcaa120d300f56423dc59f5217332789750"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
