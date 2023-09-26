DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "68b150d02fa96eaa7a69c0909cabefa9"
SRC_URI[arm-fb.sha256sum] = "b0820f9cfecb8a4d8a400be18a2d9e59847c87501d415d40145ef9031ff0dbb7"

SRC_URI[arm-wayland.md5sum] = "c392dfd60bc5694524179a40ceb84162"
SRC_URI[arm-wayland.sha256sum] = "35a26741a711290cf28106a46cdc1601e06e21bcd7ca21bef70c46be87d5c82f"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "47708a9bc4b7155f575806beac746173"
SRC_URI[aarch64-wayland.sha256sum] = "042c594a9560dfa3a752ab69426e7c44153e35a0b66009bfb3cfaf3ade1248a8"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
