require jailhouse.inc

SRCBRANCH = "imx_5.4.24_2.1.0"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch"

SRCREV = "be2ac14e35d5ee655222da554bb589cd139038cc"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
