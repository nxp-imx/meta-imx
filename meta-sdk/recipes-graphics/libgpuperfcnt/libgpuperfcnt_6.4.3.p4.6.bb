DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771" 

SRC_URI[arm-fb.md5sum] = "569727d4aeeb3f12808d14a3b1b1b0f6"
SRC_URI[arm-fb.sha256sum] = "24accd0cbbbb2e1e7b9d047b89b9f8beee49473004c343c6aa89d3c3a356b35b"

SRC_URI[arm-wayland.md5sum] = "1742484433f5a52173ff7d1541b87dd7"
SRC_URI[arm-wayland.sha256sum] = "46d9427e540e61431bdcfce201d2faecc2c12e9248ec7c5fcc4a1fb1c2590682"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "a2256f3c003bfcf4ba4a10d3186d0810"
SRC_URI[aarch64-wayland.sha256sum] = "129a7e192cbe6b8093f110722bd9afd4fb3f62cdc2889ec4ddb38b207c64d074"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
