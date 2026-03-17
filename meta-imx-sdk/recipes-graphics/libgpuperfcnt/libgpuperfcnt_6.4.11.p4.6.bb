DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "ede1e10"

SRC_URI[arm-fb.sha256sum] = "251efe163b2dbedf8f1fb758139dd77a96791c13c9161d2843c7ed246f9a2fa0"
SRC_URI[arm-wayland.sha256sum] = "e41d0131106a437b372c7d8b88d759f89e84c1f24c6178896f6bf2700ab402c0"
SRC_URI[aarch64-wayland.sha256sum] = "489c7b9058ac8a1335ff3dbaefbe50c9ca733ddd2136e5f6f9dec18f4b0dab8b"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
