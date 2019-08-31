DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI[arm-fb.md5sum] = "d238d084d677323958d51979444d004e"
SRC_URI[arm-fb.sha256sum] = "17e04c7f7aa6941e1362e3cb5a2964ca2463d8b9ca3b3bab81f0bd9a56b4c1de"

SRC_URI[arm-wayland.md5sum] = "e1b357480acfb324832c1ea6c332f031"
SRC_URI[arm-wayland.sha256sum] = "24e85fd61b9fa20d59064a8bdf4a63df319811125611b3f0b36bafb00a2bd1c6"

SRC_URI[arm-x11.md5sum] = "3cfcfa4647f268136a713e9ae910a5eb"
SRC_URI[arm-x11.sha256sum] = "8ba12def2803dcef7c7a435a99bb701584a5d92b4b66c4ff5487815fda730319"

SRC_URI[aarch64-fb.md5sum] = "137248d8a847c3e3e456fef89379949c"
SRC_URI[aarch64-fb.sha256sum] = "8a81b8c0ec46498ec1c34ef149226638c4aa963002c4ac9e3d5d75b24fb7946b"

SRC_URI[aarch64-wayland.md5sum] = "ac036e4f98d6f3e7f7e62e5790c57cb6"
SRC_URI[aarch64-wayland.sha256sum] = "21156dcc561633a5cd816078111c31671e2b09d0b43fa127003d1aa662de7dad"

SRC_URI[aarch64-x11.md5sum] = "488c6c191d60b05424c09b4ca83969df"
SRC_URI[aarch64-x11.sha256sum] = "7c598885bbcbab1e7cae44ab5a5c2bf6e5f3a37c9931026cce004f67a0c7add2"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
