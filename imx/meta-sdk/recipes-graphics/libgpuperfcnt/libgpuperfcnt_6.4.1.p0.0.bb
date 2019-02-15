DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "49f19f1568cdd1b3f585cdb55d04d3fd"
SRC_URI[arm-fb.sha256sum] = "3e988e14b3e151d9afa174bc0110587e74130dbd520aec18461dfd45375c81f8"

SRC_URI[arm-wayland.md5sum] = "7312778ce8501b3f5edf1d58a1569cbc"
SRC_URI[arm-wayland.sha256sum] = "e81b4492cdbf9fc793b2adc63dec5ff238379d3fd7cab1da69772b525f2d9d05"

SRC_URI[arm-x11.md5sum] = "1cb5fd2e8ae01eb291a994767194f3dc"
SRC_URI[arm-x11.sha256sum] = "9d5b749e1c66ab09c4afbe63a905183059a698cf95863e0c994799ebc1b4d4d1"

SRC_URI[aarch64-fb.md5sum] = "1b0f9687b240d9d80487dc9e993f27e1"
SRC_URI[aarch64-fb.sha256sum] = "02034a4239cb854f1319f2ecfd9ea06c2cb01c63bc47cc8c3a1cd4dbf1b24262"

SRC_URI[aarch64-wayland.md5sum] = "74f01ddb0b3acc57ffb67ed2a8d81d50"
SRC_URI[aarch64-wayland.sha256sum] = "bea0ee92bc073ca009dc5ef2eb822ea6e86c634ec7790ad534f1ddda8cfc2b74"

SRC_URI[aarch64-x11.md5sum] = "abd53df873a9f911e6bad58ee916193a"
SRC_URI[aarch64-x11.sha256sum] = "46bb1cb42c7767e9379311d4906f0ae6d31ca72e201a41b0beba9e68affec51b"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
