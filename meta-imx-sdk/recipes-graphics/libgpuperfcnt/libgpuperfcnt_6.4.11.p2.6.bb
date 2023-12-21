DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

IMX_SRCREV_ABBREV = "e4ba456"

SRC_URI[arm-fb.md5sum] = "9301f9fc5066b71ba22b8b39f0854091"
SRC_URI[arm-fb.sha256sum] = "d55870ab8ccd2742ecadf7c2440c328e5d4a8fc007207befa6807d0dd17efcf6"

SRC_URI[arm-wayland.md5sum] = "fd49ff13b0f3f8a439340d2900baf7a7"
SRC_URI[arm-wayland.sha256sum] = "cc83995a9ab09497c7ecc1afda419b3cddb4409d1296fddfa93f4b0eaeac48d0"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "e6d73fcf7b101f0786e73bd583ea2bf3"
SRC_URI[aarch64-wayland.sha256sum] = "74e5c14ae9fec5147186687eabe49f0e169b7ca828cabc5e93c001b95436dd03"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
