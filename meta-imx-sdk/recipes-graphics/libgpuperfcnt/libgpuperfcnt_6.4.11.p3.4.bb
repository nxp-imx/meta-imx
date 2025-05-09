DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "fbd27f5448f43e29d99579ab713837ac261906807ce9873ab8a272ea93b2a1fe"
SRC_URI[arm-wayland.sha256sum] = "d5bc688f7193b8fc5eeac8aee5bd471680c975597a1389c8ffe20f4d8fd0a62e"
SRC_URI[aarch64-wayland.sha256sum] = "625b05d5d24b3c4871be81dc3e3edbae8246ea39de83126fc470b9858b2826ca"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
