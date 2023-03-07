DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI[arm-fb.md5sum] = "e2d4c3c2f9517b0dc6a0cc59c3f81d83"
SRC_URI[arm-fb.sha256sum] = "4263061a3a6a631422964ca7bec1701e8d64d39d42b7abe420f7b3b06aa53d84"

SRC_URI[arm-wayland.md5sum] = "25ab0043c434d560ea6305e57c5b5639"
SRC_URI[arm-wayland.sha256sum] = "012a39905be350eca585d581c35056acadced4f21f292b99b883567fb7a4b60e"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "04ca7c307075953d16a436fd05eea4a5"
SRC_URI[aarch64-wayland.sha256sum] = "9ce71461f0c1157e990fccc80233252d173b066f615f1b6d31b79130586ab8ff"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
