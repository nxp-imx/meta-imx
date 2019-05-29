DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "2e0b9c0aee6a8feb6125b5b04fd0e184"
SRC_URI[arm-fb.sha256sum] = "368dcaba3aee8f26f14f11e434f5216b6255f37e49f55c9fd3d03148562ac353"

SRC_URI[arm-wayland.md5sum] = "b40eb11c81f6330ca4aa644e65201f41"
SRC_URI[arm-wayland.sha256sum] = "3553f6ecee1b2fdb922dc547cd10ccf25258aa23d9d64a03c5ce5230d11dec64"

SRC_URI[arm-x11.md5sum] = "a30b3ca9ff458ba091575ec43770b931"
SRC_URI[arm-x11.sha256sum] = "016fed715075e3c64aba7ea02a042f9547a95bd1620f86bfc30869d429443596"

SRC_URI[aarch64-fb.md5sum] = "f536291e59d0deee92ff8479d7c257f9"
SRC_URI[aarch64-fb.sha256sum] = "38acb60fff5244b303b457c4dcb5776823b1cb9faae3f8fa86e2fcc83235cc68"

SRC_URI[aarch64-wayland.md5sum] = "a4a4067ff7e056ac24376a73c9456484"
SRC_URI[aarch64-wayland.sha256sum] = "571f8fdb2e366cfc7c3834987514480a7a11f1784802f1f854a3762154cce20b"

SRC_URI[aarch64-x11.md5sum] = "0111160d4e73fa6f4ae9129a6e61db0b"
SRC_URI[aarch64-x11.sha256sum] = "066b39f3b82e20ac88865a46e715f22654bad4aa2a6a5ad353de8999709ac02c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
