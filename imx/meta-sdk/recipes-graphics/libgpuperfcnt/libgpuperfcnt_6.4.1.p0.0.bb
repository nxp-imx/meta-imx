DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[arm-fb.md5sum] = "5337667be8e474480dc03e89679088c5"
SRC_URI[arm-fb.sha256sum] = "3e17b2aeb938f6c7f53b9213eec5e88417244cc0de91e53b75506a966b81774c"

SRC_URI[arm-wayland.md5sum] = "6a5374f1dca05c6ee5b38ba980211a0b"
SRC_URI[arm-wayland.sha256sum] = "f951dbe749ec8a622eb76aa00645c03790e53e833782a1d66df3b0b20a13e04c"

SRC_URI[arm-x11.md5sum] = "3206fdeedb070a61f6252c662a4bd025"
SRC_URI[arm-x11.sha256sum] = "12aa32fa2660a4309a9ea2fbbdb0d7c2c36c166f401687108e0743a410e7dec4"

SRC_URI[aarch64-fb.md5sum] = "c4f2eb99d4310dbef804175bc0dcccef"
SRC_URI[aarch64-fb.sha256sum] = "0d652b885f226ace259db25eaf9a1b7b5b458ff1f5eb6e7d3faa83a99902bde4"

SRC_URI[aarch64-wayland.md5sum] = "e575aaa2e879b621edf99836052b7f49"
SRC_URI[aarch64-wayland.sha256sum] = "2dc4353fe574440be633d55874481136f6a81cf797b59eab5a459e27399ce488"

SRC_URI[aarch64-x11.md5sum] = "f67d62250611f0dc40deef16000e7a71"
SRC_URI[aarch64-x11.sha256sum] = "487f68c3cda46093394c6fd83aebbfbb4e8737e7ffdf414a4f01ff0d05ecd238"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
