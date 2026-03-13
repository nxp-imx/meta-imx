DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "abc76fa"

SRC_URI[arm-fb.sha256sum] = "5f81c19d393534c25f72ec02131ce484e95b5a77f766fbab2870b3af860a2d59"
SRC_URI[arm-wayland.sha256sum] = "8d2e479c30f58b62e7b0e967a536182379af507fc743049a63d7bd553efb43e1"
SRC_URI[aarch64-wayland.sha256sum] = "86deca493e89f0ce737e86bf9de17692e190ebcd4f946cf8c35b401ea7b76881"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
