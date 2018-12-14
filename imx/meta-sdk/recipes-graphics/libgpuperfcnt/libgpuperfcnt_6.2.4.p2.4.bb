DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[arm-fb.md5sum] = "fb6fcbbefdca5db5e5cca123600ca90c"
SRC_URI[arm-fb.sha256sum] = "debc4ef4b85a21c7234521e7a6a5e6c541d2918cdaf339ed3d2d8536a82ae715"

SRC_URI[arm-wayland.md5sum] = "7aef7d7173937f0c4aa8ea6a0228d858"
SRC_URI[arm-wayland.sha256sum] = "8f597d2d8d030bc31fb482c5cdf36b4996107ec9a8abe539ec36a6dbedb27463"

SRC_URI[arm-x11.md5sum] = "abd6b2bfb66179da58e74fb30ab35b31"
SRC_URI[arm-x11.sha256sum] = "171e44a6d1951fc43c102e027adc001ba3938fc3e6558a0e5e88eaffbe5975c1"

SRC_URI[aarch64-fb.md5sum] = "458a0be168b1acbe7e10ac908207af24"
SRC_URI[aarch64-fb.sha256sum] = "03ff48d857e974e646735dbe5559645fbe187895cc001f5634159868a0234768"

SRC_URI[aarch64-wayland.md5sum] = "1eb7ac843bc4e6969a460dce5a993328"
SRC_URI[aarch64-wayland.sha256sum] = "c47194390510a7d5768cf722e284ebe722de1ec771ca68b9a0ba1b88e486c732"

SRC_URI[aarch64-x11.md5sum] = "1d17c87bb9d5eb1904036ae03d84a46a"
SRC_URI[aarch64-x11.sha256sum] = "3f5f49f0d7d8bffa5204f5a503830431757f9afb132ceda0598b3c78af41f703"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
