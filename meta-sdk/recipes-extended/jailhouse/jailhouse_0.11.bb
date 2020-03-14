require jailhouse.inc

SRCBRANCH = "imx_v0.11_y"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch"

SRCREV = "58956f183a29ede763ea2fea9f907c8ac86dc2af" 

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
