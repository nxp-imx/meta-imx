DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI[arm-fb.md5sum] = "805eb963cd5cf80f23b3341e2c092a0b"
SRC_URI[arm-fb.sha256sum] = "3484a1e228f0fc7bb4bbefd68fd69edf04c8675bbad5a889d445fcf30a131992"

SRC_URI[arm-wayland.md5sum] = "42a28b89e6cd60c27fa5c11a9a43c0a1"
SRC_URI[arm-wayland.sha256sum] = "1e0f7b04621f4a7206206b84e717e24151899f0c2a68d9e3eb1881fd5fd2f6ad"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "340392d8035bde29f91f1a9f5087ef82"
SRC_URI[aarch64-wayland.sha256sum] = "c6b512f024a54a7da1cc03dc71817c8143ec71a00ee30f0cb87fc1c99864dd72"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
