DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[arm-fb.md5sum] = "5337667be8e474480dc03e89679088c5"
SRC_URI[arm-fb.sha256sum] = "3e17b2aeb938f6c7f53b9213eec5e88417244cc0de91e53b75506a966b81774c"

SRC_URI[arm-wayland.md5sum] = "3cc6285ba3764adc17c5190a34eb87f6"
SRC_URI[arm-wayland.sha256sum] = "d442824c964c33ea0845ca158b16da7deec46a943895628d73be846957cab1f3"

SRC_URI[arm-x11.md5sum] = "3fa25ba361f66aabb3330ef9da142b18"
SRC_URI[arm-x11.sha256sum] = "9aa4fb36f9564a90a08422f8f345d685c6de3a56a7321797ffdd2272f0df8c83"

SRC_URI[aarch64-fb.md5sum] = "c4f2eb99d4310dbef804175bc0dcccef"
SRC_URI[aarch64-fb.sha256sum] = "0d652b885f226ace259db25eaf9a1b7b5b458ff1f5eb6e7d3faa83a99902bde4"

SRC_URI[aarch64-wayland.md5sum] = "57b4d336c553fff33d5e4581374782b6"
SRC_URI[aarch64-wayland.sha256sum] = "800f6e16c8602ea0d3b4dcb7a1bdb4643db84a7185df94f0ad4cd2260d2128f0"

SRC_URI[aarch64-x11.md5sum] = "4fdbb0d2e22bb20fad07ccfa70a07745"
SRC_URI[aarch64-x11.sha256sum] = "0aa64b423ee2fc5609bb8974fe8c2988f59b8b9897be83a2dff12fa4c00632f9"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
