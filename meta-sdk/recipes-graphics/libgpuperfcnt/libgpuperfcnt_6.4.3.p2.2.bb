DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[arm-fb.md5sum] = "073eeb4d380a9ebac47834859e2c89fd"
SRC_URI[arm-fb.sha256sum] = "b68a521500eb010e130358c6a0419ca4532dcb005263f85a5139021cf21d5a9e"

SRC_URI[arm-wayland.md5sum] = "7741932ade39c5f5a004a266164d8c49"
SRC_URI[arm-wayland.sha256sum] = "3243e89a8e25b02c05f171db770e25b309de8e268f3557120ebdbccf31d5212e"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "8f1eea677a7d33aeb2c8b845d2f13f39"
SRC_URI[aarch64-fb.sha256sum] = "e12e5fa382784ee0a878957971a399812d5a762678e0b9d0435fe906e8372f11"

SRC_URI[aarch64-wayland.md5sum] = "06f3cbaae36b5e3a55d8d9ccbda0a80d"
SRC_URI[aarch64-wayland.sha256sum] = "0301604a5d6783a1e873f093fca0af26cfb3bcda0c678e334e003e4bb8a8de15"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
