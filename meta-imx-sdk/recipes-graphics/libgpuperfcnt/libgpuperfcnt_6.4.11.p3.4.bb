DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "03b169c5355be8d62a21561637a419923b09d5d8f22f1552a60b7a2fdf7194b5"
SRC_URI[arm-wayland.sha256sum] = "dfbfb5dff28c040af0be3ea43da1e61843c52ac1dc11a4076c9e00af7cc435bf"
SRC_URI[aarch64-wayland.sha256sum] = "625b05d5d24b3c4871be81dc3e3edbae8246ea39de83126fc470b9858b2826ca"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
