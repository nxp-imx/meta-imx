DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "b227c21"

SRC_URI[arm-fb.sha256sum] = "251efe163b2dbedf8f1fb758139dd77a96791c13c9161d2843c7ed246f9a2fa0"
SRC_URI[arm-wayland.sha256sum] = "e016c17cc08769eedadfadca123796ac6a1eb7a19576a628443099af1a81f155"
SRC_URI[aarch64-wayland.sha256sum] = "311a1c808b4125aea8fb0f7ae1f974ed2a8d439902d4af2fa574143dab3776c7"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
