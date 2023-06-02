DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI[arm-fb.md5sum] = "3acecc2a512d417afb85b292c6b44f56"
SRC_URI[arm-fb.sha256sum] = "0a5ffbce7211bae478dfd3b7c7d62b70cbeafabe46814ef3d17fd95e7539e33c"

SRC_URI[arm-wayland.md5sum] = "314a82865fe7c4eb1e82dbf7beaba6e9"
SRC_URI[arm-wayland.sha256sum] = "e4750b4593596edb009ba8dc706d435c2f169b984f45277e643173b4cd2bddfc"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "60c380c03d75b253cef465e6b02e1280"
SRC_URI[aarch64-wayland.sha256sum] = "fb464e7b9f29e6d7a5a500909c43cfc2195cd536f1e495c4545d4faa5596aaf5"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
