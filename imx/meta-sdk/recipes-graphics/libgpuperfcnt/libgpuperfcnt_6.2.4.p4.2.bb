DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[arm-fb.md5sum] = "5447e588a4486777d0d9719f3abc96aa"
SRC_URI[arm-fb.sha256sum] = "f40f0241b6786666856057af1540aa0a2570e4a383c813f21f8a5428f512b090"

SRC_URI[arm-wayland.md5sum] = "87f30d7b90abd2a31e53b91999d6a25d"
SRC_URI[arm-wayland.sha256sum] = "5e901c737214117c7b291ce1ce7feda3a021421f73a3a187feb8a048c01739f7"

SRC_URI[arm-x11.md5sum] = "d36f0ec608f23acdbc011c890584b4f1"
SRC_URI[arm-x11.sha256sum] = "bb0dfcc947b54a8f8df30005e3fbaf6bb1b6bd314ccc181139c46a30412c8fe5"

SRC_URI[aarch64-fb.md5sum] = "23bf8f5371d8b0fa4b168ad34bd060e8"
SRC_URI[aarch64-fb.sha256sum] = "dfc1d6dd955637ade36355c31fab641503d42b9c65aa11e17b3652a1c1f77bf5"

SRC_URI[aarch64-wayland.md5sum] = "45b2f88e65e391b5044233e9bdf7989b"
SRC_URI[aarch64-wayland.sha256sum] = "62abb750768501855dd332e41a4af59288ff8ab7b627a83c54c493276bb29dc3"

SRC_URI[aarch64-x11.md5sum] = "439f38f2bd7d9f7ce7a6dd67671b1f74"
SRC_URI[aarch64-x11.sha256sum] = "3d5fd26614efbf38eb291fa0667f157a2fce9cd439abb98fc3b783fcf6d3fe51"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
