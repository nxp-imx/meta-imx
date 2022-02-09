DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI[arm-fb.md5sum] = "5ace2bd53ac9731d1c0dd6ac9544e30e"
SRC_URI[arm-fb.sha256sum] = "19f07c7948ea2fb345f4a34068bc2f1e948ec61483b27932eb897ba29a80b6ea"

SRC_URI[arm-wayland.md5sum] = "b5148ce832b0b813b889f001a8f318ec"
SRC_URI[arm-wayland.sha256sum] = "ab4e9a03685c3fbe168612ee3fdf41bfcf658533727b890fac64e76db58f328a"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "6dc9074dde9a79e9edededc90b4841fd"
SRC_URI[aarch64-wayland.sha256sum] = "615ad3659702bddf676168f48666ed0003b62c3397aa79134eb81ac0e8892bbe"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
