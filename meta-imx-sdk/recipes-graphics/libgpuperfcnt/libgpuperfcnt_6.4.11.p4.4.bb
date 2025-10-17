DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "f0ecb46d7af3584a25e502a49d19eb1ba106f529d052dccf0b61c518e7ffb9d6"
SRC_URI[arm-wayland.sha256sum] = "8000570a0cc5394b094737a4bedbdd9b362befb4be509e58d00e39d017b4d445"
SRC_URI[aarch64-wayland.sha256sum] = "05390803ab64c3c10179d3e223187abab0cdd8a307797d773846097592dc56bc"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
