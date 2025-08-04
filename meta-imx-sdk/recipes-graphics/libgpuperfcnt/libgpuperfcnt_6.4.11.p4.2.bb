DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e0a132a"

SRC_URI[arm-fb.sha256sum] = "362cc8239a08cba98983d91352eafaa3f041c9e9af53710d18587a3c7749927d"
SRC_URI[arm-wayland.sha256sum] = "17681a75706645b5b5c2ed57eac874343abdfadc079eb1ea21259352dee7729e"
SRC_URI[aarch64-wayland.sha256sum] = "d9377bc88eed626764aade948b32300fa04174dbe7eda106cc95d0d51d6d2ac8"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
