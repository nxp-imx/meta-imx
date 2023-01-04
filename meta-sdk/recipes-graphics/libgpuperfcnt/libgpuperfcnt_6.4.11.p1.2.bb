DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI[arm-fb.md5sum] = "45acfaa6f15785160e3f1bf5d84d4d78"
SRC_URI[arm-fb.sha256sum] = "b9114b0bcdf35d3a11b4efb58d2c9a712fa9bf5c30426392322c908fe6a32ad8"

SRC_URI[arm-wayland.md5sum] = "7a84eef3d1f509e41e310a4fcdb8ec09"
SRC_URI[arm-wayland.sha256sum] = "b8735f1d477ecb14a7f824d142377ed214db11beab7aef66d9b9a98ccc91d4d0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "14bdc2b6a50423a51470f04165b8ea08"
SRC_URI[aarch64-wayland.sha256sum] = "192331445e1d30a3fb932baad6b4e30fcf2ea9a41aaad3e3ed8d4327e592cefd"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
