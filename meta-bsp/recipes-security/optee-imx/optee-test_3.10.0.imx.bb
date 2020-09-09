# Copyright (C) 2020 NXP
require optee-test.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_5.4.47_2.2.0"
SRCREV = "30efcbeaf8864d0f2a5c4be593a5411001fab31b"

do_compile_prepend () {
	export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
}
