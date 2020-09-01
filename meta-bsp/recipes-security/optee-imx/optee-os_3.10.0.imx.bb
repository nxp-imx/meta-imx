# Copyright (C) 2020 NXP
require optee-os.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_3.10.y"
SRCREV = "53d5f3e38254c5cb5a8e32bc318e254823f1b81e"

# tee-init_load_addr.txt has been remove in lates optee-os version.
# to keep backward compatibility with existing optee-os recipe.
do_compile_append () {
    if [ "${OPTEE_ARCH}" != "arm64" ]; then
        IMX_LOAD_ADDR=`${TARGET_PREFIX}readelf -h ${B}/core/tee.elf | grep "Entry point address" | awk '{print $4}'` && \
        echo ${IMX_LOAD_ADDR} > ${B}/core/tee-init_load_addr.txt
    fi
}
