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

SRC_URI[aarch64-wayland.md5sum] = "aa0bc0fd43e7ccc3b276e880282de8fe"
SRC_URI[aarch64-wayland.sha256sum] = "7e1f30cd4c6114427a3a5418d8c60239fa1219935d96ae37e944ea4b3ac49b93"

SRC_URI[aarch64-x11.md5sum] = "611a6d44b13f2cbb98e0ea3176191d7d"
SRC_URI[aarch64-x11.sha256sum] = "8b782d7b37fbf6ba4990aa8d36cd8c36789838a43a66300769e61d724b461b0c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
