DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "0dd6aeebeba7b765e98c65ba6f182eb1f4e3e7393e4696e1374b32ad34c953a4" 
SRC_URI[arm-wayland.sha256sum] = "8a120b4bc23afd539693a5244770c8176ee269ea9bbc366d257f616639b5906f"
SRC_URI[aarch64-wayland.sha256sum] = "7ccd23fb5470cd773b8074aeab59f3649eaea712dd664955e05e8cdf9307f0db" 

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
