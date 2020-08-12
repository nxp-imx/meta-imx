DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "44a5ccfdfa22f8b1662f3baec7d5f4fc"
SRC_URI[arm-fb.sha256sum] = "7ccf34f357aec642517c277b20288f3844fb1397b103a37b382b655806e2eccb"

SRC_URI[arm-wayland.md5sum] = "0abc64f6d211ec2e25e475e386d35c8b"
SRC_URI[arm-wayland.sha256sum] = "ee6da2560d8280b655751163bd1f51bd0622c2159a1cdb79d2912c3c9a3717b6"

SRC_URI[arm-x11.md5sum] = "68baf02e57dbd30b2324b0bfe7fa92c4"
SRC_URI[arm-x11.sha256sum] = "21c00299e0b042b07bb4de6a17ec1ca862a56b66ae2eae63214384bd4a0d6100"

SRC_URI[aarch64-fb.md5sum] = "90fef1100f3f7972516dc594780612b7"
SRC_URI[aarch64-fb.sha256sum] = "46659e73e8c78b1f109ee14a3ed0102fd7ece5ec77b3d256623e260ca0e70230"

SRC_URI[aarch64-wayland.md5sum] = "fb58c75d6b5fe6fff6764772baf28b71"
SRC_URI[aarch64-wayland.sha256sum] = "06b9669eb380bd2a250bfc514f8113f1e71a0b6e230449d0e03e811af93a0f6c"

SRC_URI[aarch64-x11.md5sum] = "8ac6c1035d14587cd82aafb906c4acf0"
SRC_URI[aarch64-x11.sha256sum] = "c1e034ba69621f91a7c6a3343d60b4f8d6be084973b6144b3674ae3b427813ae"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
