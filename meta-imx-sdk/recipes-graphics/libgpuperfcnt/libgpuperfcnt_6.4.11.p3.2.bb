DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "2be2f6e264b58dc0501f23af46165a276ff1227047e4622c2bb4a407a09fadb9"
SRC_URI[arm-wayland.sha256sum] = "c21a2ab868ad6e141a3dc8643ac37090b5586f483acb85257805a949e3f0cd31"
SRC_URI[aarch64-wayland.sha256sum] = "4053ef06969e8845b3f9519dfd04233b975277bbe3957b0f817f022386b60e55"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
