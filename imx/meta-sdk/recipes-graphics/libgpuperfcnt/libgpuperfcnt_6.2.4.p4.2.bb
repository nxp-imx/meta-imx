DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "5447e588a4486777d0d9719f3abc96aa"
SRC_URI[arm-fb.sha256sum] = "f40f0241b6786666856057af1540aa0a2570e4a383c813f21f8a5428f512b090"

SRC_URI[arm-wayland.md5sum] = "00c5925344c4b7f15f6054562c946b78"
SRC_URI[arm-wayland.sha256sum] = "ea8ebf993d24dae8f0dcf811aa18d09fc12a48cf4039033386026632f2574cb1"

SRC_URI[arm-x11.md5sum] = "d36f0ec608f23acdbc011c890584b4f1"
SRC_URI[arm-x11.sha256sum] = "bb0dfcc947b54a8f8df30005e3fbaf6bb1b6bd314ccc181139c46a30412c8fe5"

SRC_URI[aarch64-fb.md5sum] = "23bf8f5371d8b0fa4b168ad34bd060e8"
SRC_URI[aarch64-fb.sha256sum] = "dfc1d6dd955637ade36355c31fab641503d42b9c65aa11e17b3652a1c1f77bf5"

SRC_URI[aarch64-wayland.md5sum] = "f392f5182bd646eae786ec17d92ee60d"
SRC_URI[aarch64-wayland.sha256sum] = "7cf9f0ed18d17c651e435dc0a7e8613a5eaf376ad743c63a2dda8c1f75729ff3"

SRC_URI[aarch64-x11.md5sum] = "439f38f2bd7d9f7ce7a6dd67671b1f74"
SRC_URI[aarch64-x11.sha256sum] = "3d5fd26614efbf38eb291fa0667f157a2fce9cd439abb98fc3b783fcf6d3fe51"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
