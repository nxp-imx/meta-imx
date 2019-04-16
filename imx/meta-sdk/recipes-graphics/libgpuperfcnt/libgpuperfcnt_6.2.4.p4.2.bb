DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[arm-fb.md5sum] = "80cdaeed8ad0e814a01ed3d7f644f3c3"
SRC_URI[arm-fb.sha256sum] = "4578e1d3235c33200f3c3a5cc2c6d23e5ae34f5fe7e6340735121680cce9c439"

SRC_URI[arm-wayland.md5sum] = "b40eb11c81f6330ca4aa644e65201f41"
SRC_URI[arm-wayland.sha256sum] = "3553f6ecee1b2fdb922dc547cd10ccf25258aa23d9d64a03c5ce5230d11dec64"

SRC_URI[arm-x11.md5sum] = "4c405bc3a9a5307274320a83eec0a83f"
SRC_URI[arm-x11.sha256sum] = "fedb2c90280f24865aacea4f8e9fbd1459d34e86583cc10593159a50cb53a790"

SRC_URI[aarch64-fb.md5sum] = "f536291e59d0deee92ff8479d7c257f9"
SRC_URI[aarch64-fb.sha256sum] = "38acb60fff5244b303b457c4dcb5776823b1cb9faae3f8fa86e2fcc83235cc68"

SRC_URI[aarch64-wayland.md5sum] = "b6a3158289e327d1744bdc97809defa7"
SRC_URI[aarch64-wayland.sha256sum] = "3d0112214c40639e83cd613fe0dfb882b51b8ff40c98e8146b4b27e2c47390e9"

SRC_URI[aarch64-x11.md5sum] = "e9fe26b319e8671f704359dbf45138d8"
SRC_URI[aarch64-x11.sha256sum] = "3f054642a842cc0da657d4c71508935adb9feb3ce567b0754b1688b689c31b80"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
