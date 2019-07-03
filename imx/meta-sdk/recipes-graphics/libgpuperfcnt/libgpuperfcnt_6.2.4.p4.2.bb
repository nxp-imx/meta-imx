DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

SRC_URI[arm-fb.md5sum] = "dfc49b4c7c8995b49d7369b2eb85636d"
SRC_URI[arm-fb.sha256sum] = "6c55dfc3f85e1d27656340465433bda1ebb374be4db8d2b2aa800d40f5b9322a"

SRC_URI[arm-wayland.md5sum] = "87f30d7b90abd2a31e53b91999d6a25d"
SRC_URI[arm-wayland.sha256sum] = "5e901c737214117c7b291ce1ce7feda3a021421f73a3a187feb8a048c01739f7"

SRC_URI[arm-x11.md5sum] = "3696cb15cbfd6f2f54cc20c43b4db16e"
SRC_URI[arm-x11.sha256sum] = "a883a38c49f672ff5fc2b2823bef4a654c1152b00bd797b41cbbd5dad178b70a"

SRC_URI[aarch64-fb.md5sum] = "f37a2c81d16d49691fe53e1d8866b9f1"
SRC_URI[aarch64-fb.sha256sum] = "726cca2af52ee0872e1ea6918e719255a92367a01b5a50ea66085806d5020b78"

SRC_URI[aarch64-wayland.md5sum] = "34a2b44d47ef19e961531514798cced1"
SRC_URI[aarch64-wayland.sha256sum] = "5ecf22cebf1501caf53fef2fe5fd228e11b6c19c5043c0683c83412c5ddf2e27"

SRC_URI[aarch64-x11.md5sum] = "04693a0f03f59b89087dc1720f44bab6"
SRC_URI[aarch64-x11.sha256sum] = "1a3195d5a40487f39100a6036337365f88a5708c77dd94f234062a945a180a05"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
