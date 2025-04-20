DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "b76f20ca06bbbdd625eaf9735c14df10febefacedd38e31c9daf524f7281b21f"
SRC_URI[arm-wayland.sha256sum] = "552ce96e7f9fccfd316e19a93cf82fe1d91d7c5610a6fa483894b6400b07c533"
SRC_URI[aarch64-wayland.sha256sum] = "1d82911a8b18980540afc7e859d7fde6789d7721129773f8135133d476be6889"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
