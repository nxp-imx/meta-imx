DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "e7010ac92ae51d187ae587610ca3659d"
SRC_URI[arm-fb.sha256sum] = "8bd4ef0b766100208a65cd6241f17cf25aea04f6eef66629ef8b4f2d3bba6e38"

SRC_URI[arm-wayland.md5sum] = "4f7e4c0743f75cafcf4f6a2cec5a3b69"
SRC_URI[arm-wayland.sha256sum] = "13bfd2fe9320ee2e9c1cd5f22ebe34a8d63ba6da809d31d47ccaef212676412f"

SRC_URI[arm-x11.md5sum] = "02ad1b4e78cd20b03d667ec02a2a60e0"
SRC_URI[arm-x11.sha256sum] = "781c9e59555398d3c05456f90c1d25cec362c179aabeea38653f48e36b7afaa0"

SRC_URI[aarch64-fb.md5sum] = "b8924871d285add8f713d5eb46f5c51d"
SRC_URI[aarch64-fb.sha256sum] = "6f9f55dd7c7f0ca93ef3d46063b5ad71e35c1a175ce573052a497ffc500bbc27"

SRC_URI[aarch64-wayland.md5sum] = "5db039c1ffce2d11875bc94861b2feea"
SRC_URI[aarch64-wayland.sha256sum] = "00d8e8402a9d48774ab4a347a03bb65f2178e759805783bd25e5b344dc7554b6"

SRC_URI[aarch64-x11.md5sum] = "7dd9275564fb80c745ebecd1ccfc9934"
SRC_URI[aarch64-x11.sha256sum] = "5dd61f3cc504331f2226d22925ccae5f26ee8551e20e77075785181760d86101"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
