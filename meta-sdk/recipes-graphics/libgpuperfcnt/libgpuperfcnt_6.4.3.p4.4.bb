DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[arm-fb.md5sum] = "1cf2128390cd6df15fb923c43cc21488"
SRC_URI[arm-fb.sha256sum] = "dd1c99a8aa1dcc0da91a64078b0ec19ffa40c8fffd085477943cdf77480c4cb9"

SRC_URI[arm-wayland.md5sum] = "b3cdc01b2a3b01ae17bdc816a5942c35"
SRC_URI[arm-wayland.sha256sum] = "11c6c03486f70a49f6530a71931b673c13001d9f3c8b7551c4561530aff2d2ad"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "50de428421ffb0890186fd16c9adf65c"
SRC_URI[aarch64-wayland.sha256sum] = "df2b1ab22717fee6ea6f4cc4ef8a5747702be86c100e5672eb1c123d97428a93"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
