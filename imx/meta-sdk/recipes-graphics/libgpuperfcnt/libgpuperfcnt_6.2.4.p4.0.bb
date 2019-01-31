DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28"

SRC_URI[arm-fb.md5sum] = "5f039a673b2e753178c60078338b121a"
SRC_URI[arm-fb.sha256sum] = "33fe43ca064e31758f30e9586208eb39892e9d1a3f4fa1a8d80eb1c417d9a4fa"

SRC_URI[arm-wayland.md5sum] = "2ddd70cad3313a3e797520351ac648e8"
SRC_URI[arm-wayland.sha256sum] = "75cafaebafa864a5bd2f94d201f99a77c63fda84a8d8ce1fa4797bebe6fa250b"

SRC_URI[arm-x11.md5sum] = "030fddec7718cd36b7622633e2ac0067"
SRC_URI[arm-x11.sha256sum] = "47f6d24ec52267c7bdea6e53134873d3d474cfe93c8590e7d1e60ccf2a2905bc"

SRC_URI[aarch64-fb.md5sum] = "a035c14085158f96b6d252a794a46e4d"
SRC_URI[aarch64-fb.sha256sum] = "0bac6aaea2003d320b6a19c9acdddeefba307b691004d70c6ca357cb0f451090"

SRC_URI[aarch64-wayland.md5sum] = "54a3c7eb8c831b571efafd599b59be0d"
SRC_URI[aarch64-wayland.sha256sum] = "91203cc0e1e879c2fcc17aa629c0557cd9589a9e7ee48306dcac6387a6e128ca"

SRC_URI[aarch64-x11.md5sum] = "5f910aee4291414775db765f1928befa"
SRC_URI[aarch64-x11.sha256sum] = "9853bfcc9c5206d35b67fddd9c12669c62b65962ed1bf73dad052eaec895a188"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
