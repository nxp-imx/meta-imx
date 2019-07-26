DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[arm-fb.md5sum] = "348518edd0c1fbf066802a3d60741344"
SRC_URI[arm-fb.sha256sum] = "6c7cf34cd041a537dcd051ead71e392599a7c29fa93703d6a736928bb3cf09f5"

SRC_URI[arm-wayland.md5sum] = "00bbd63b0177cbe149f75fc106e8fc4c"
SRC_URI[arm-wayland.sha256sum] = "5a1fe0e67883ad52b872f3b43303ddcf670b03291ccb625d3186bf2d98fa432a"

SRC_URI[arm-x11.md5sum] = "e04324ebbf5b355b6f16dff16abe8d6d"
SRC_URI[arm-x11.sha256sum] = "ba49b1a638897b613c2285d64d2c78a09764a6e94a0450ff85c7fe5e5422e791"

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
