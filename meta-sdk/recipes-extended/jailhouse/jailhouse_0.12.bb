require jailhouse.inc

SRCBRANCH = "imx_5.4.47_2.2.0"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-scripts-include.mk-multilib-Fix-hardcoded-lib-in-fir.patch \
           file://0002-tools-scripts-update-shebang-to-python3.patch \
"

SRCREV = "8bbe203ee7c1fc16198ce1bf964e54c90606c3c2"

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
