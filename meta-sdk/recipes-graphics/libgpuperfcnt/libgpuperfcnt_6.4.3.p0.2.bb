DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

SRC_URI[arm-fb.md5sum] = "bcf9ffc8d6bb28ff57e77ee972e0fe8e"
SRC_URI[arm-fb.sha256sum] = "111ecd3c421fa0ad46917d8653144c8dfe8b5592e2dc6ad05792f74edfc6d4e4"

SRC_URI[arm-wayland.md5sum] = "8730ac2848b79680aea462a0fadb33b7"
SRC_URI[arm-wayland.sha256sum] = "e77712a4ad2bbfc10b21c9fc68daadec924a6c5d29c1473fa605e0d24b7f8f41"

SRC_URI[arm-x11.md5sum] = "5cff036f483b02d5f581c3059826052d"
SRC_URI[arm-x11.sha256sum] = "d222327d86dd18e118f5d7ebed096501094e3c85cbda45b615bfc0a0ff07b3b5"

SRC_URI[aarch64-fb.md5sum] = "348ea239ed39427f3b5b40d57a663084"
SRC_URI[aarch64-fb.sha256sum] = "9d26bcb051f6f3404747dc389b9f98c9a6813c257010e0018e83a0e53144a33a"

SRC_URI[aarch64-wayland.md5sum] = "f25d5a5f921ffddaa07519930e8b6dbd"
SRC_URI[aarch64-wayland.sha256sum] = "86ab4c49802b00e24936ae707eb6231c94cebe9af7963acb59d7cddbea251733"

SRC_URI[aarch64-x11.md5sum] = "3eddd37b4d4b5f13bc79c9b7798b498c"
SRC_URI[aarch64-x11.sha256sum] = "e207ad4dfd47de28756b93c8f9e8d9b2b53b14262648e1ec3c1aafe642666dff"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
