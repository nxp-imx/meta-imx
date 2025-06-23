DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "bca42f2ba27b68561d97becfd60fdfbfb0be204808b995ed8a777e156413a171"
SRC_URI[arm-wayland.sha256sum] = "07334d80e692b6c228437d037ec97ca5d59af9f9b3ddf12a8503defc9bd7e1be"
SRC_URI[aarch64-wayland.sha256sum] = "1f24a74fae88814eae2d3ca35addddace7889438500105a137265c961d1bacdd"
SRC_URI[aarch64-wayland-mali.sha256sum] = "a0dff721ac7ff6a89862f85bf5a49f60df571dbab8676babbf702feb8e4d5da5"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGECONFIG ??= "vivante"
PACKAGECONFIG:mx95-nxp-bsp = "mali"

PACKAGECONFIG[mali] = ",,,mali-imx,,vivante"
PACKAGECONFIG[vivante] = ",,,imx-gpu-viv,,mali"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
