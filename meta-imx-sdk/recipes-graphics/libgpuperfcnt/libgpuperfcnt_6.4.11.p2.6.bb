DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

IMX_SRCREV_ABBREV = "99ab423"

SRC_URI[arm-fb.md5sum] = "4824fe0fadf237c6fd7c4f906517bf74"
SRC_URI[arm-fb.sha256sum] = "3a6ad76ed39a066a14520da567aeb177e85d8ca48bfe2a4f9568ac8858b0ef1f"

SRC_URI[arm-wayland.md5sum] = "263a673c9fe10ffb1f82342c8310335d"
SRC_URI[arm-wayland.sha256sum] = "856ae708132db2a3dc189244f87d3cc36565ee0392e3fcce9c9c9deb7b74b090"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "b38a416670258fc2bc21bcb90120833d"
SRC_URI[aarch64-wayland.sha256sum] = "a2f173b5217a653a7e3407782572bf9b14cb90ffe32a101e18cf89d884a36a7b"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
