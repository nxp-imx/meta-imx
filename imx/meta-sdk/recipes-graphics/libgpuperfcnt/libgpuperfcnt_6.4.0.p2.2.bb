DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[arm-fb.md5sum] = "ecd9d944d64175c6fdb92328cb7dfd6a"
SRC_URI[arm-fb.sha256sum] = "966e891ef42a72017ebe1142503a5211072b0090c33cfe98de4adeb45505fa54"

SRC_URI[arm-wayland.md5sum] = "3a02ead9e2f7d7c8a818214bf9254b0f"
SRC_URI[arm-wayland.sha256sum] = "7774eacf6c232dce6b604f3b59c618aef645621a42b1be4028ff27d4c0f51491"

SRC_URI[arm-x11.md5sum] = "859b9d64867d59ffcd3e598ac0bbcadb"
SRC_URI[arm-x11.sha256sum] = "0a894447c1b5743f1e2e1f6aed6134ec9b6bee0aebfd0a077f498b8a863cffc8"

SRC_URI[aarch64-fb.md5sum] = "de8a632b90d92256e14a1838c6f4e7a8"
SRC_URI[aarch64-fb.sha256sum] = "b340e983bae5ff2f10e4bb1479e2509dca14cf01956410e11da9dfc9eb03a563"

SRC_URI[aarch64-wayland.md5sum] = "2d04f2fbc6fdf312eba8c9d888b34f57"
SRC_URI[aarch64-wayland.sha256sum] = "a891771e064586346f5277572f09910c7b9e01b1beae5cacc88ec3fe8ddb8990"

SRC_URI[aarch64-x11.md5sum] = "81bb86399b21a222197dc9c75f7fdacc"
SRC_URI[aarch64-x11.sha256sum] = "c34c27d7a8cafed20fc26ee407d776efd6bd89e1556ac8dab2ecaecef7417c1f"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
