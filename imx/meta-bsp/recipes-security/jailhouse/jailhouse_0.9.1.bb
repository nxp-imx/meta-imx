require jailhouse.inc

SRCBRANCH = "imx_v0.9.1_y"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"

SRCREV = "${AUTOREV}"
PV = "0.9.1+${SRCPV}"

CELLS = ""

COMPATIBLE_MACHINE = "(imx8mqevk|imx8mmevk)"

