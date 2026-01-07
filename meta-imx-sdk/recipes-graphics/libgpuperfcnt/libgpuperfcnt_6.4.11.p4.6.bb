DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "581111e9e6962c58f560f36b5462f0c37294eec9fce32947f843d88f47d259cd"
SRC_URI[arm-wayland.sha256sum] = "dc7b114a67731c79ebfdcc0e101819de5bdd63c6d5aafba2279223b8836a3405"
SRC_URI[aarch64-wayland.sha256sum] = "5e145ca1309e857f11d8a115136f8560c0e151e530b1dd5ecd6a65afeffd1ed1"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
