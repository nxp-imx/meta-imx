DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "95b9a52"

SRC_URI[arm-fb.sha256sum] = "b76f20ca06bbbdd625eaf9735c14df10febefacedd38e31c9daf524f7281b21f"
SRC_URI[arm-wayland.sha256sum] = "174e5066216f85719d56505d288393e9745907adc2a3c671d64e5de23d75b0c2" 
SRC_URI[aarch64-wayland.sha256sum] = "01a6d1f0e0aab220fbed084f6d032158411cb35dc03b2fbf3cea3c44d5e4fb8d"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
