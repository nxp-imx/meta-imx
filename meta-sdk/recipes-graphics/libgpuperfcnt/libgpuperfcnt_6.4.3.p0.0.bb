DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[arm-fb.md5sum] = "b925c1f96643883ae6d0a6dac7747c57"
SRC_URI[arm-fb.sha256sum] = "cdeed42c471e737e0e8e38254695151f01ad581ade0228016335a6b4e133c777"

SRC_URI[arm-wayland.md5sum] = "e7a2a0ffa686c9f97104f6858c0c4f04"
SRC_URI[arm-wayland.sha256sum] = "987023d68516fd8ecbf5d68033583898753867fe225512a0f8fff9ffea85f502"

SRC_URI[arm-x11.md5sum] = "68baf02e57dbd30b2324b0bfe7fa92c4"
SRC_URI[arm-x11.sha256sum] = "21c00299e0b042b07bb4de6a17ec1ca862a56b66ae2eae63214384bd4a0d6100"

SRC_URI[aarch64-fb.md5sum] = "cd69e360b82cd93e4a48f1a64adf5269"
SRC_URI[aarch64-fb.sha256sum] = "deea5c2c98ff40249faff9472b9cd2b88af76fd4bad7253fcc63959148d1dc37"

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
