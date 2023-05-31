DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI[arm-fb.md5sum] = "a6ff393a8e9cbbf2f8fd2e71087d677c"
SRC_URI[arm-fb.sha256sum] = "b3e92fd7289dc07c2053e97cbd1c735dcbca1d724f7a0067b3472e3ca97d02b7"

SRC_URI[arm-wayland.md5sum] = "730faaeaf048c1e25c1ef822866a96ac"
SRC_URI[arm-wayland.sha256sum] = "6a4d72bf9f6b667f05ae790dce11ec81cc89281756eef8def67d6f8dd4429fce"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "02c1b373b84c1e0cf8d2b67b862c8433"
SRC_URI[aarch64-wayland.sha256sum] = "a72ccacad02689b5ad8cf0db6a89064d61432d6c4f76ac83b1c928a652400b26"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
