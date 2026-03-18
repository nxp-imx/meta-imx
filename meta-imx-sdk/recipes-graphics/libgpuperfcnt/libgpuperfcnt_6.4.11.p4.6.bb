DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "f65a566"

SRC_URI[arm-fb.sha256sum] = "3e0f20297db00fcc2e1e83f82567bb1a3b8808d92027c1d9bfbb8b8fd87dd9e3"
SRC_URI[arm-wayland.sha256sum] = "e41d0131106a437b372c7d8b88d759f89e84c1f24c6178896f6bf2700ab402c0"
SRC_URI[aarch64-wayland.sha256sum] = "86d1b92e5fe7312ccebf0175d5429855d2ea76e635690b64ac7d42397070e3ee"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
