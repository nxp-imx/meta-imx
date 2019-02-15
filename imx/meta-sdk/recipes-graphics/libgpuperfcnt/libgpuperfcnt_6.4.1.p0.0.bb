DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=80c0478f4339af024519b3723023fe28" 

SRC_URI[arm-fb.md5sum] = "49f19f1568cdd1b3f585cdb55d04d3fd"
SRC_URI[arm-fb.sha256sum] = "3e988e14b3e151d9afa174bc0110587e74130dbd520aec18461dfd45375c81f8"

SRC_URI[arm-wayland.md5sum] = "8d2a5e6f7d25ac37cb56ed2307f06432"
SRC_URI[arm-wayland.sha256sum] = "29941db3570ddd7e34531fb26d209fd30e5de3b233c54554746809e76afdb44d"

SRC_URI[arm-x11.md5sum] = "ebac1fa0f5b5c649ecbff721b6d6d1d8"
SRC_URI[arm-x11.sha256sum] = "83fd54d64d756b6d2882fde4745da9eebc26fa01cd4d38072ca15dd1cd6bb04c"

SRC_URI[aarch64-fb.md5sum] = "038ea9008ae4dfd3bde5f3b75398a733"
SRC_URI[aarch64-fb.sha256sum] = "0e8c7560349ed385ff0608924238e352cfa51d7f1c9cd9b8604764db0e703577"

SRC_URI[aarch64-wayland.md5sum] = "74f01ddb0b3acc57ffb67ed2a8d81d50"
SRC_URI[aarch64-wayland.sha256sum] = "bea0ee92bc073ca009dc5ef2eb822ea6e86c634ec7790ad534f1ddda8cfc2b74"

SRC_URI[aarch64-x11.md5sum] = "b0708c41b7965a27eaf11d81edeb4efe"
SRC_URI[aarch64-x11.sha256sum] = "44aa750a567a1d69aa5483f1aeb477016f7a27df1b972474e69a3545410cafae"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
