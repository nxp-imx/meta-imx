DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "5f9c839"

SRC_URI[arm-fb.sha256sum] = "2333b569cda62f9a08ab63858bf9671624d5c5f0c92a785928278b55b19dfcb8"
SRC_URI[arm-wayland.sha256sum] = "d1a17c3a0a2ac9cd1e08b3276eadf8b5a4337afbe0dbf668dd0988b3a24a4196"
SRC_URI[aarch64-wayland.sha256sum] = "86deca493e89f0ce737e86bf9de17692e190ebcd4f946cf8c35b401ea7b76881"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
