DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"

IMX_SRCREV_ABBREV = "99ab423"

SRC_URI[arm-fb.sha256sum] = "90076a76043a61f0c047d52873de1613c6305ea256d7407aa57cfe590da2de1e"
SRC_URI[arm-wayland.sha256sum] = "de080f0ea00060235baec97c220ce419308773e693fec4e1fafc4d136175208e"
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
