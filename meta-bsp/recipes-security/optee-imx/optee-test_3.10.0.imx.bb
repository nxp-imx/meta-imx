# Copyright (C) 2020 NXP
require optee-test.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

OPTEE_TEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"

SRCBRANCH = "imx_3.10.y"
SRCREV = "be4c2a706efef1ed8d495b0533b39c38ae1b1290"

do_compile_prepend () {
	export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
}
