DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[arm-fb.md5sum] = "4503f50628ff5dbaf9897031a0a22b78"
SRC_URI[arm-fb.sha256sum] = "221aaebaea1c77d7116bdf2d758c1863fcef33bbcf5c08ef34ff6648bba52960"

SRC_URI[arm-wayland.md5sum] = "bb6edde7205406a2ec57b98058223d3c"
SRC_URI[arm-wayland.sha256sum] = "b4001c88dbfe5477c65c9ff54256df0db1ace047f17a767a72a8e9b51a994ebe"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ff3379347910af1eb9441d8ea786dff1"
SRC_URI[aarch64-wayland.sha256sum] = "aa4fb7b3c03b3644c96620b647d1f77b976584b76e67db277c6317341687225c"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
