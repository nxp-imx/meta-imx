DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "5232391aaa67f65a9694fd1d3e38a3fd"
SRC_URI[arm-fb.sha256sum] = "86058c574207b0b34cdae5476f41b9ad20d9d25ab159796c0638e23ae203d804"

SRC_URI[arm-wayland.md5sum] = "fb4b7f85e4b43d8be3442dbe0a194230"
SRC_URI[arm-wayland.sha256sum] = "cc7fce20435629c23c064580b13109523626ddf53d6037f23f716a7cb3df89cb"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "32e56d2bd67613ddd99cb4191ca4c7f4"
SRC_URI[aarch64-wayland.sha256sum] = "8a2184aabdea09d1cdbc3a3ddd61bb5eb5bd0419803a36449f5b11986b955e7b"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
