DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5" 

SRC_URI[arm-fb.md5sum] = "71c892871ea069287b5da74c75d1a53c"
SRC_URI[arm-fb.sha256sum] = "f28763f6c482ee24f7903e0ef044c50658b58989dbfbb0d4098f04b845e9350c"

SRC_URI[arm-wayland.md5sum] = "6a4190ce8d36ed0fab0a6d1877138d98"
SRC_URI[arm-wayland.sha256sum] = "232ac8ee4f26d998e65f943b295cd58cf2b822d94375ba87a7fe2d410a457f76"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "7391653a7d4005823510602f4ea4273c"
SRC_URI[aarch64-wayland.sha256sum] = "6c8edfd95cf5efd2ddc2b01d9c1e144d9271099ccf5d61061da6812aa9d7d217"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
