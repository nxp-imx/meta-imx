DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "89658ffeb5bd62f62f393c2835d9f8b5"
SRC_URI[arm-fb.sha256sum] = "579d5023cc917c0a791d66ef29fbc09ecda07a9f656776288f3f04e0fa744bd9"

SRC_URI[arm-wayland.md5sum] = "e7cbe06172a644bf28bb79f310ed3522"
SRC_URI[arm-wayland.sha256sum] = "7ba3daa2bb486838d03ead2956d22cc4312becd32f19b1d397fcc6509ff96198"

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
