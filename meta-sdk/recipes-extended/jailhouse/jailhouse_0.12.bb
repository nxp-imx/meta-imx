require jailhouse.inc

SRCBRANCH = "imx_v0.12_y"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch \
           file://0002-tools-scripts-update-shebang-to-python3.patch \
"

SRCREV = "4e8f574c35b8ac81a6cf052fc84404165a82e374"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
