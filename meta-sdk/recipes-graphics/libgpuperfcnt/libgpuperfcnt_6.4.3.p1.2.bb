DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[arm-fb.md5sum] = "88f75e3c56d44fbb7ff4bbcb0042d4b2"
SRC_URI[arm-fb.sha256sum] = "cbcbf327eabd4b6001ec9e112e8086c3c96118866ba67671827aac67252f61be"

SRC_URI[arm-wayland.md5sum] = "a58ab90dc0044423a3ce19a88ad85a2d"
SRC_URI[arm-wayland.sha256sum] = "0e3d936102de769a08b77b2aebdc4c101ff83e49e3c915502c0720c892e4bd8b"

SRC_URI[arm-x11.md5sum] = "ea5f2efbaeb6a66b17244cd86c5414e3"
SRC_URI[arm-x11.sha256sum] = "3c7d345153ad8aea95c50b0f2c3b8a507fe8569fa893ac423ba53f2c370e6620"

SRC_URI[aarch64-fb.md5sum] = "b7a65d6e64f81518ad4405179128ebc5"
SRC_URI[aarch64-fb.sha256sum] = "9dc417f59ea4a9b0522a5d104fde8193e83873de7c3719fa8313c36e33ebfde5"

SRC_URI[aarch64-wayland.md5sum] = "1f9115bc628909f60f4ff043a73f4ee3"
SRC_URI[aarch64-wayland.sha256sum] = "f9acd416077112b2bc9809eaeca6d0ed94a98cc6756afe45ac56f0ca51cb56a2"

SRC_URI[aarch64-x11.md5sum] = "a01382dd6676421641de40a3db973674"
SRC_URI[aarch64-x11.sha256sum] = "e6330220b0fee30a3b4c33ea3d184cca5fa30a999fd6e8887bcf4e827d486c23"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
