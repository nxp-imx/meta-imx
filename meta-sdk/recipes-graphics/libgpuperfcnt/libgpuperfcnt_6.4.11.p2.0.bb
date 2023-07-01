DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=673fa34349fa40f59e0713cb0ac22b1f" 

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "320480a381dc6e6b576629a38cc4b14f"
SRC_URI[arm-fb.sha256sum] = "43dfb57d857947b6af5906d7849e3e3d2c8a9dbd019dc7fbe16823af17fd2ae8"

SRC_URI[arm-wayland.md5sum] = "512c3c018b2b97996cd7e87bf82fa34c"
SRC_URI[arm-wayland.sha256sum] = "c13f7891735039095527ae4c13e8c730776d5ceb84a9a23a9b99a379512e1ac0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "d765ad5a72432b78ea9fcd56796a5886"
SRC_URI[aarch64-wayland.sha256sum] = "ea62ae6bc0fa504b6bfe543f66c0b0f8967b37dd989627105c6b576eaef7415e"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
