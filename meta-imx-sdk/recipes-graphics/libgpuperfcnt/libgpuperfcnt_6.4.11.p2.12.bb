DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "6b92f07b4d9d3bd2c09b61ec8ffbd93709d776d4ff84a7fb59b0cb21f1318faf"
SRC_URI[arm-wayland.sha256sum] = "889ec0d4b71e1f3d73fc76b8530db305bf0378f167aa820b54a44a75396fa012"
SRC_URI[aarch64-wayland.sha256sum] = "b4f9c99f93ed42cc9cfd1e3bc8306c8fad8ed6b80d637bc18c35acd6e3e79ace"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE                  = "(imxgpu)"
COMPATIBLE_MACHINE:mx95-generic-bsp = "(^$)"
