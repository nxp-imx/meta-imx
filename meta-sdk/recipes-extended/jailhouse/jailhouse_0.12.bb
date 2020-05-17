require jailhouse.inc

SRCBRANCH = "imx_5.4.24_2.1.0"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch"

SRCREV = "a88654bdfeb13ed6ce74800360d8616b42269221"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
