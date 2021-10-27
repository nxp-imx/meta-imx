DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[arm-fb.md5sum] = "6e829d7f989fd42325b3ed7de131eb92"
SRC_URI[arm-fb.sha256sum] = "0940020f8793aee65268d4e13b532fc5a33f9d0b2da47808fdaa0f8972475114"

SRC_URI[arm-wayland.md5sum] = "69d87c56bd9ec455afed29629219dd78"
SRC_URI[arm-wayland.sha256sum] = "230004b859c9673d17c5bce99675b6833ae6c8f73e3e08be043f991e58ec88cc"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "79b281d7a29466bf655cf0c01e6370c8"
SRC_URI[aarch64-wayland.sha256sum] = "93c68aaf7afe492ae70e09dc5ea177acec399b416cb5661d725d4023f13a8893"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
