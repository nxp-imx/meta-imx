DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[arm-fb.md5sum] = "dfc49b4c7c8995b49d7369b2eb85636d"
SRC_URI[arm-fb.sha256sum] = "6c55dfc3f85e1d27656340465433bda1ebb374be4db8d2b2aa800d40f5b9322a"

SRC_URI[arm-wayland.md5sum] = "87f30d7b90abd2a31e53b91999d6a25d"
SRC_URI[arm-wayland.sha256sum] = "5e901c737214117c7b291ce1ce7feda3a021421f73a3a187feb8a048c01739f7"

SRC_URI[arm-x11.md5sum] = "3696cb15cbfd6f2f54cc20c43b4db16e"
SRC_URI[arm-x11.sha256sum] = "a883a38c49f672ff5fc2b2823bef4a654c1152b00bd797b41cbbd5dad178b70a"

SRC_URI[aarch64-fb.md5sum] = "23bf8f5371d8b0fa4b168ad34bd060e8"
SRC_URI[aarch64-fb.sha256sum] = "dfc1d6dd955637ade36355c31fab641503d42b9c65aa11e17b3652a1c1f77bf5"

SRC_URI[aarch64-wayland.md5sum] = "34a2b44d47ef19e961531514798cced1"
SRC_URI[aarch64-wayland.sha256sum] = "5ecf22cebf1501caf53fef2fe5fd228e11b6c19c5043c0683c83412c5ddf2e27"

SRC_URI[aarch64-x11.md5sum] = "439f38f2bd7d9f7ce7a6dd67671b1f74"
SRC_URI[aarch64-x11.sha256sum] = "3d5fd26614efbf38eb291fa0667f157a2fce9cd439abb98fc3b783fcf6d3fe51"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
