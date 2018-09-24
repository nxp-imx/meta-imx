DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "e7010ac92ae51d187ae587610ca3659d"
SRC_URI[arm-fb.sha256sum] = "8bd4ef0b766100208a65cd6241f17cf25aea04f6eef66629ef8b4f2d3bba6e38"

SRC_URI[arm-wayland.md5sum] = "4f7e4c0743f75cafcf4f6a2cec5a3b69"
SRC_URI[arm-wayland.sha256sum] = "13bfd2fe9320ee2e9c1cd5f22ebe34a8d63ba6da809d31d47ccaef212676412f"

SRC_URI[arm-x11.md5sum] = "af726b7833232e38a1a6550023ff89c9"
SRC_URI[arm-x11.sha256sum] = "2b4c9d1fae9dda67a361c0196c286a3b38b7f178710eec360110ca81926a66d3"

SRC_URI[aarch64-fb.md5sum] = "0dad892e40c36169e2b492b5cae546b1"
SRC_URI[aarch64-fb.sha256sum] = "cf31a4cd568411f95053796817c64ee535344835de7572aee7bf6e14ff7d1f85"

SRC_URI[aarch64-wayland.md5sum] = "5672815cee304e1c284a35c40a19f49a"
SRC_URI[aarch64-wayland.sha256sum] = "a2833ca934ea6ed5eec8b69126ead335cde1d7e5174eab8f55d465131b7215ab"

SRC_URI[aarch64-x11.md5sum] = "66251f609a016772fbaa48bbeccdcf81"
SRC_URI[aarch64-x11.sha256sum] = "e9d972ae5566e681294146b94a3839e31c67853ad8e073e982c36118526b2c2e"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
