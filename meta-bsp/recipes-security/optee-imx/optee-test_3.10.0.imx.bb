# Copyright (C) 2020 NXP
require optee-test.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_3.10.y"
SRCREV = "58e3a83ba1729c9447c88b084715ed9ff27ffc40" 

do_compile_prepend () {
	export CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_HOST}"
}
