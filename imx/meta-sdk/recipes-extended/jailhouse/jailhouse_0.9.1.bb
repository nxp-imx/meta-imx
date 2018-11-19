require jailhouse.inc

SRCBRANCH = "imx_4.14.78_1.0.0_ga"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH}"
SRCREV = "77f684fba4f28bf4c592fa664f49d614610e5726"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
