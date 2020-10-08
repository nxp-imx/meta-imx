# Copyright (C) 2020 NXP
require optee-test.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_3.10.y"
SRCREV = "67862c80754e72b9be3330e958363014f4c031d1"

do_compile_prepend () {
	export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
}
