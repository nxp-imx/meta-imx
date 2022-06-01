DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5" 

SRC_URI[arm-fb.md5sum] = "33bb5f62eba4f533d7c382de5d1b32db"
SRC_URI[arm-fb.sha256sum] = "1119e343e1b61b7c83cfab4a71cc7cccb750aa3b12e817beddf99c0de22e451d"

SRC_URI[arm-wayland.md5sum] = "edfa39200d6443116eeef7c9df107cea"
SRC_URI[arm-wayland.sha256sum] = "f51fe60ca79cbad552f95d5f21ace15d82b806012e0fe745b7d6e5904e074316"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ae2e16ed44881f002ae4afaacfd82e0f"
SRC_URI[aarch64-wayland.sha256sum] = "0c5077fc3f0f2ad4bf911b3e602e7f3ebf7c886bc74d2dfe42ebd62750e8c18a"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
