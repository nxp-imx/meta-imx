require jailhouse.inc

SRCBRANCH = "imx_v0.12_y"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch"

SRCREV = "78dd1013f68c3f32292d844d60d8e473278842b3"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
