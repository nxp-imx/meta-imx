DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "085a2a26724a48b91bf49aef3b43dca6f62541523221ddbcbd9945912adea1cd"
SRC_URI[arm-wayland.sha256sum] = "c21a2ab868ad6e141a3dc8643ac37090b5586f483acb85257805a949e3f0cd31"
SRC_URI[aarch64-wayland.sha256sum] = "bff16f2b8a374574c5057fd5e8b66aa61fc7a9e09a2d09b852bf471f22c7b0c5"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
