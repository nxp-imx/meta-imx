require jailhouse.inc

SRCBRANCH = "imx_v0.10_y"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"
SRCREV = "fba45a724bf9af7be76a88706d12344caa2164a8"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
