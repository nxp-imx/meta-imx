DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374" 

SRC_URI[arm-fb.md5sum] = "3acecc2a512d417afb85b292c6b44f56"
SRC_URI[arm-fb.sha256sum] = "0a5ffbce7211bae478dfd3b7c7d62b70cbeafabe46814ef3d17fd95e7539e33c"

SRC_URI[arm-wayland.md5sum] = "332981fc437ea85f79083ad17beaa2d2"
SRC_URI[arm-wayland.sha256sum] = "60c1feecef1076e614cffb37f32bbb6b2e27940c550bd014ffcc8ef6bf169796"

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
