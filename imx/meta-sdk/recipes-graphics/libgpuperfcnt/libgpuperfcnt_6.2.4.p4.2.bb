DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "2e0b9c0aee6a8feb6125b5b04fd0e184"
SRC_URI[arm-fb.sha256sum] = "368dcaba3aee8f26f14f11e434f5216b6255f37e49f55c9fd3d03148562ac353"

SRC_URI[arm-wayland.md5sum] = "6f558a8bdd81e5c279355c6d528a41b0"
SRC_URI[arm-wayland.sha256sum] = "b63514248818d8bccd43ed09987a442f3e34aa2e2df740f447e8a75678b7e44b"

SRC_URI[arm-x11.md5sum] = "649f7289c1ba7b486970e6b3738fbd35"
SRC_URI[arm-x11.sha256sum] = "fd939611d4eb93ddbdf280f3190428015a2121e256464c5b693e53b91ef9d117"

SRC_URI[aarch64-fb.md5sum] = "b29414c4bbd275c48461beb9d00e5bb0"
SRC_URI[aarch64-fb.sha256sum] = "481eb4ee29c5aa81b2205bf921ba1f392d58c19d62279cd3c8150eee47d18b3d"

SRC_URI[aarch64-wayland.md5sum] = "6ff2700816e1ab23e788870e5912ebf1"
SRC_URI[aarch64-wayland.sha256sum] = "b1ecf1ee28103f14b15ce2245eebdd23188496ff4b75e5f76693dac866bbba76"

SRC_URI[aarch64-x11.md5sum] = "0111160d4e73fa6f4ae9129a6e61db0b"
SRC_URI[aarch64-x11.sha256sum] = "066b39f3b82e20ac88865a46e715f22654bad4aa2a6a5ad353de8999709ac02c"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
