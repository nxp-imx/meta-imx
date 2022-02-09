DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI[arm-fb.md5sum] = "bb377ce6fab3129e8ad370f98830f23a"
SRC_URI[arm-fb.sha256sum] = "a46702fa5bbe9d5f816c491c32d172d9624e5c82a3ae62d8229cfdaa4e8f505f"

SRC_URI[arm-wayland.md5sum] = "4d41561cd44c27ffa43c78876578803f"
SRC_URI[arm-wayland.sha256sum] = "4f9a713db9f46e7b9af809efb7d712f2945ce20705ee82f3ade9440ed02529c2"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "db744d0fbb7dedf63c9ce112a5d6e3dc"
SRC_URI[aarch64-wayland.sha256sum] = "c7195809f0d770a752cf0448a7c0fbc6eff59ada576f84b76cf98329e50f4df1"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
