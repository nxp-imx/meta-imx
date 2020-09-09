DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[arm-fb.md5sum] = "4d0c4dc21257f3522dc6f70979e921e5"
SRC_URI[arm-fb.sha256sum] = "f5d955316e7c9dfd70c9356a91d0c757cf0c42e9e39a045bd7d7f750564245d7"

SRC_URI[arm-wayland.md5sum] = "6c2a9b5c887360c418e37bfeddf50a81"
SRC_URI[arm-wayland.sha256sum] = "d90fd26470f6d3f0f76e2f53f079dddc78244ef2803101a94bf722b79144957b"

SRC_URI[arm-x11.md5sum] = "1dc96acac5be66e89ad32828f4ffa92a"
SRC_URI[arm-x11.sha256sum] = "e6d94fa820b11776ad88aefa2f4ad7a5cb26f67e05b019172107eda7c9eadeb2"

SRC_URI[aarch64-fb.md5sum] = "31c97ef0982113a198844fb20ee54e2f"
SRC_URI[aarch64-fb.sha256sum] = "b774fcf1a8d125e18b638eda0b15495bf971221360e585639a58a155b2a2968e"

SRC_URI[aarch64-wayland.md5sum] = "b46dff95b6aab876b518cc1dde4a1568"
SRC_URI[aarch64-wayland.sha256sum] = "f1b02f1718d03d10ca6ba00f188a091bbefb9295da82a33c03a3f627140c3cd2"

SRC_URI[aarch64-x11.md5sum] = "34c242c4293ae63358e0d9c01a561128"
SRC_URI[aarch64-x11.sha256sum] = "d530d2266b31563eba772a99ca16e5ca8f069de02379a552b4526a79c538e019"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
