DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[arm-fb.md5sum] = "95706533a1707523033b46c42a209e18"
SRC_URI[arm-fb.sha256sum] = "779085b0d2dfbcb5a2b4e5e9eb379ca300c6ca8cb767e484156f85517447e0c3"

SRC_URI[arm-wayland.md5sum] = "4c60d1243eb30ee03d1b4b9cf7848003"
SRC_URI[arm-wayland.sha256sum] = "1e99355f4418d0d65bfc4bae68ac744ee436159c5b4c5bdb9d7e6e5fb2f8ed7c"

SRC_URI[arm-x11.md5sum] = "68baf02e57dbd30b2324b0bfe7fa92c4"
SRC_URI[arm-x11.sha256sum] = "21c00299e0b042b07bb4de6a17ec1ca862a56b66ae2eae63214384bd4a0d6100"

SRC_URI[aarch64-fb.md5sum] = "eb8de96b01f142253f8b4d3679fd55ce"
SRC_URI[aarch64-fb.sha256sum] = "8b8ee6a98cb03c4950d4a666b960ce00e80ed16a9601f087cd24a59e50e6ecf0"

SRC_URI[aarch64-wayland.md5sum] = "9910082edf1bfa000c6d25b412fe7b4f"
SRC_URI[aarch64-wayland.sha256sum] = "71af741c7a971861e21804a3ef182dcfdc77b012c2c3582631c42942affbe32a"

SRC_URI[aarch64-x11.md5sum] = "8ac6c1035d14587cd82aafb906c4acf0"
SRC_URI[aarch64-x11.sha256sum] = "c1e034ba69621f91a7c6a3343d60b4f8d6be084973b6144b3674ae3b427813ae"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
