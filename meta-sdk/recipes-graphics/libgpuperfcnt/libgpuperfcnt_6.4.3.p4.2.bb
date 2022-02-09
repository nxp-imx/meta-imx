DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[arm-fb.md5sum] = "2b734eaf01ef6c2ed7b31551a12bea86"
SRC_URI[arm-fb.sha256sum] = "ae1349d1509804d55de8f71569840b600b9b97824cba3c8818fe0c7a270593ec"

SRC_URI[arm-wayland.md5sum] = "b5148ce832b0b813b889f001a8f318ec"
SRC_URI[arm-wayland.sha256sum] = "ab4e9a03685c3fbe168612ee3fdf41bfcf658533727b890fac64e76db58f328a"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "169987be1b63ee40352ae95b8008811d"
SRC_URI[aarch64-wayland.sha256sum] = "a80beed728ec848fcd8d1b7ebdc5d523e28db0ff2f617cac4a8a899ebeebcff2"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
