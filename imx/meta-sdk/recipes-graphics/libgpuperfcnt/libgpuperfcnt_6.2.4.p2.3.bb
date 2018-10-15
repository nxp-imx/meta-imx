DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "c38828189cc582611ddc82765ba5b555"
SRC_URI[arm-fb.sha256sum] = "25dce14c3a1e4e306c6e6d498beef1af92e5249c2674bc0e38ce7563a9a53c2a"

SRC_URI[arm-wayland.md5sum] = "376d34dae6bfabe0360da797cf1af4d6"
SRC_URI[arm-wayland.sha256sum] = "6c4cfe545122dd397d8eedcc89151243be24ae1bce23484510a103e1b6deb430"

SRC_URI[arm-x11.md5sum] = "2d3f7496edf89b1f851a195867febddd"
SRC_URI[arm-x11.sha256sum] = "01fe078630cd0b86e076234e0e97d2aaef8861832c6095dfca70770ccdbb976f"

SRC_URI[aarch64-fb.md5sum] = "626f89ecbd3c5a90264bb6ff818bbbf5"
SRC_URI[aarch64-fb.sha256sum] = "70f148f6b32bfd2032b58b2346efd10dea7df06e4e59c1b13feeb96f959139b9"

SRC_URI[aarch64-wayland.md5sum] = "c3babacd5daa3072d8efe92a4f93f084"
SRC_URI[aarch64-wayland.sha256sum] = "f09bb8741d31657bb7550ffda6135fc1bbe71f1d6f9e599616d61f011ab0466a"

SRC_URI[aarch64-x11.md5sum] = "a4dae1d0c012f499a2b66b9ccb972329"
SRC_URI[aarch64-x11.sha256sum] = "0013cf7312d72b68221a447852c23e56685a5c3ba28906176c41edeb1247711f"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
