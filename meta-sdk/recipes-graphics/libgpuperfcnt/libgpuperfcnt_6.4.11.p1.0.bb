DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b" 

SRC_URI[arm-fb.md5sum] = "4fb6b12ed723efccb34acb581fd9d9f9"
SRC_URI[arm-fb.sha256sum] = "6c3500407a7bdf651a4b4ec197cbb3d9b6e6799725dc6f9f68f77d9b2ac17e41"

SRC_URI[arm-wayland.md5sum] = "8c3944bf24e9627cd172b1f09a5f818f"
SRC_URI[arm-wayland.sha256sum] = "8ce92d2c5bb61edf87b9f0fab74273a822cc4186a9c680be6ddeaafec843af92"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "98b865f534fc208bcd23d0c9265532c7"
SRC_URI[aarch64-wayland.sha256sum] = "c7be2153e449483ad2735bba761f465bc93e7de09c398c3853b67bd6293a2ac2"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
