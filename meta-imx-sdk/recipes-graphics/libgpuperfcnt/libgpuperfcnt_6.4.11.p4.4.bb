DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
DEPENDS = "imx-gpu-viv"

IMX_SRCREV_ABBREV = "e779398"

SRC_URI[arm-fb.sha256sum] = "581111e9e6962c58f560f36b5462f0c37294eec9fce32947f843d88f47d259cd"
SRC_URI[arm-wayland.sha256sum] = "dc7b114a67731c79ebfdcc0e101819de5bdd63c6d5aafba2279223b8836a3405"
SRC_URI[aarch64-wayland.sha256sum] = "05390803ab64c3c10179d3e223187abab0cdd8a307797d773846097592dc56bc"

inherit fsl-eula-unpack2 fsl-eula-graphics fsl-eula-recent

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE         = "(imxgpu)"
COMPATIBLE_MACHINE:imxmali = "(^$)"
