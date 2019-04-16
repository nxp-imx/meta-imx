DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "80cdaeed8ad0e814a01ed3d7f644f3c3"
SRC_URI[arm-fb.sha256sum] = "4578e1d3235c33200f3c3a5cc2c6d23e5ae34f5fe7e6340735121680cce9c439"

SRC_URI[arm-wayland.md5sum] = "68ad3f3ea16728615256a9198d694b85"
SRC_URI[arm-wayland.sha256sum] = "c78be38f845964dd26ec7fb1a462ab4e86813a2682580ab24bb3afd11eff77c2"

SRC_URI[arm-x11.md5sum] = "4c405bc3a9a5307274320a83eec0a83f"
SRC_URI[arm-x11.sha256sum] = "fedb2c90280f24865aacea4f8e9fbd1459d34e86583cc10593159a50cb53a790"

SRC_URI[aarch64-fb.md5sum] = "0fdb1949a5ca9964ad518738f9796b64"
SRC_URI[aarch64-fb.sha256sum] = "69886950a277b13e5e1fe23f7ebd625c4feef3a73ce70271844f37367804c200"

SRC_URI[aarch64-wayland.md5sum] = "b6a3158289e327d1744bdc97809defa7"
SRC_URI[aarch64-wayland.sha256sum] = "3d0112214c40639e83cd613fe0dfb882b51b8ff40c98e8146b4b27e2c47390e9"

SRC_URI[aarch64-x11.md5sum] = "4ff6c338a129b29acc2860af2e687b6a"
SRC_URI[aarch64-x11.sha256sum] = "cf13efdf73f922e60eb38011861f5ccad492cd85ffcb5ebd38c99b48c344b921"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
