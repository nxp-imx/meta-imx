DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "bcf9ffc8d6bb28ff57e77ee972e0fe8e"
SRC_URI[arm-fb.sha256sum] = "111ecd3c421fa0ad46917d8653144c8dfe8b5592e2dc6ad05792f74edfc6d4e4"

SRC_URI[arm-wayland.md5sum] = "8730ac2848b79680aea462a0fadb33b7"
SRC_URI[arm-wayland.sha256sum] = "e77712a4ad2bbfc10b21c9fc68daadec924a6c5d29c1473fa605e0d24b7f8f41"

SRC_URI[arm-x11.md5sum] = "da7f8a0b93a1b6fb94d53b212f6668ae"
SRC_URI[arm-x11.sha256sum] = "5a9a26d0e0de72a4991c945ed862940ae67d3d997a735701385f064a86dde95e"

SRC_URI[aarch64-fb.md5sum] = "90fef1100f3f7972516dc594780612b7"
SRC_URI[aarch64-fb.sha256sum] = "46659e73e8c78b1f109ee14a3ed0102fd7ece5ec77b3d256623e260ca0e70230"

SRC_URI[aarch64-wayland.md5sum] = "fb58c75d6b5fe6fff6764772baf28b71"
SRC_URI[aarch64-wayland.sha256sum] = "06b9669eb380bd2a250bfc514f8113f1e71a0b6e230449d0e03e811af93a0f6c"

SRC_URI[aarch64-x11.md5sum] = "3eddd37b4d4b5f13bc79c9b7798b498c"
SRC_URI[aarch64-x11.sha256sum] = "e207ad4dfd47de28756b93c8f9e8d9b2b53b14262648e1ec3c1aafe642666dff"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
