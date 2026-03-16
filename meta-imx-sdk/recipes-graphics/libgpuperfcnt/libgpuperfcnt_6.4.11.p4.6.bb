DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "5f9c839"

SRC_URI[arm-fb.sha256sum] = "92b734c71962c8143282e5aece100f68d7557786decbcfd295a5ff7bd11504f9"
SRC_URI[arm-wayland.sha256sum] = "d1a17c3a0a2ac9cd1e08b3276eadf8b5a4337afbe0dbf668dd0988b3a24a4196"
SRC_URI[aarch64-wayland.sha256sum] = "311a1c808b4125aea8fb0f7ae1f974ed2a8d439902d4af2fa574143dab3776c7"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
