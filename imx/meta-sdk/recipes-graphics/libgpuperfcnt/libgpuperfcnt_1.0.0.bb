DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "50e9d9b5fc739151e66aee07053506ab"
SRC_URI[arm-fb.sha256sum] = "8c44222c330eb76503d9f67e745e1433bb822ed03122f3da339ffeb754e352aa"

SRC_URI[arm-wayland.md5sum] = "c41ea82f3d561a47f92066f62c6ab74d"
SRC_URI[arm-wayland.sha256sum] = "a3c630a9fa244b80ab48c9342ebd5a23b3972001cbb09c814f281417b16a7086"

SRC_URI[arm-x11.md5sum] = "a6a102830ca8bca7201ef950878f3b6e"
SRC_URI[arm-x11.sha256sum] = "2884cc61353fc0d818f92f3e0129969f4432c268076925f4c256ab8ac04a5d3e"

SRC_URI[aarch64-fb.md5sum] = "2461d141066244452727aade7283babe"
SRC_URI[aarch64-fb.sha256sum] = "d69cf0a646914d1ee1b534533eb8e7a8bfe5964207c0d6c1ca9aa1cca2f0bfa4"

SRC_URI[aarch64-wayland.md5sum] = "c41ea82f3d561a47f92066f62c6ab74d"
SRC_URI[aarch64-wayland.sha256sum] = "a3c630a9fa244b80ab48c9342ebd5a23b3972001cbb09c814f281417b16a7086"

SRC_URI[aarch64-x11.md5sum] = "eea32ef09ae74e54eb904d832efd96f4"
SRC_URI[aarch64-x11.sha256sum] = "41cd9903b78a1c1f0ea07879ba0f023cc8c059c4ffa831284c6fe982dfca585e"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
