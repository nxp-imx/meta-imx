DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI[arm-fb.md5sum] = "5dff3333326953fa133ef98f4559f0c0"
SRC_URI[arm-fb.sha256sum] = "e5c27b2fee7a03c7fb79ac47e06bafd9ce1aa9dc65d14e92f15d31fcbbfe0b65"

SRC_URI[arm-wayland.md5sum] = "e68e9315509333acff2ab366c6d5f3cd"
SRC_URI[arm-wayland.sha256sum] = "476647c1b18bd15edff1da4c8b8d70bbaca8f7d16edee80cf8f02eb202ba2fc5"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "3ddbaa25ddb9e583bfaf721132dfd5a3"
SRC_URI[aarch64-wayland.sha256sum] = "d4cfa3ba3d9b250e324258646d4cb9f0a39a6ba7a62fea7edd147cdeda8afd5e"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
