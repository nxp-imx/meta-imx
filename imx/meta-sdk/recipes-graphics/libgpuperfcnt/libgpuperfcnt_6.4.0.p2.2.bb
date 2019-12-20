DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[arm-fb.md5sum] = "ed23c19ee3680fb931fecc42b7aa56bf"
SRC_URI[arm-fb.sha256sum] = "741752ef5485b3127da95bad1981ec1ccce1fe80e60c4c7920be2e8b73c8d5f0"

SRC_URI[arm-wayland.md5sum] = "47dc971a44eb87d0ffa7ea3343ad16fe"
SRC_URI[arm-wayland.sha256sum] = "6d4ce04b2d34b9761186091b91d4e6202107cb24872821c1aec01bb22d932c42"

SRC_URI[arm-x11.md5sum] = "859b9d64867d59ffcd3e598ac0bbcadb"
SRC_URI[arm-x11.sha256sum] = "0a894447c1b5743f1e2e1f6aed6134ec9b6bee0aebfd0a077f498b8a863cffc8"

SRC_URI[aarch64-fb.md5sum] = "de8a632b90d92256e14a1838c6f4e7a8"
SRC_URI[aarch64-fb.sha256sum] = "b340e983bae5ff2f10e4bb1479e2509dca14cf01956410e11da9dfc9eb03a563"

SRC_URI[aarch64-wayland.md5sum] = "2d04f2fbc6fdf312eba8c9d888b34f57"
SRC_URI[aarch64-wayland.sha256sum] = "a891771e064586346f5277572f09910c7b9e01b1beae5cacc88ec3fe8ddb8990"

SRC_URI[aarch64-x11.md5sum] = "1bfb67f7179dd1631f32113e2c70c340"
SRC_URI[aarch64-x11.sha256sum] = "52fbfc58368ed4c2c69d867d74817a415e7f5c71531f1af21b40278797f5be2c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
