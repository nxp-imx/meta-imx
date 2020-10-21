# Copyright (C) 2020 NXP
require optee-os.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_3.10.y"
SRCREV = "c34de48997424fb1c3be45b5b105e7cb33e11a59"

# tee-init_load_addr.txt has been remove in lates optee-os version.
# to keep backward compatibility with existing optee-os recipe.
do_compile_append () {
    if [ "${OPTEE_ARCH}" != "arm64" ]; then
        IMX_LOAD_ADDR=`${TARGET_PREFIX}readelf -h ${B}/core/tee.elf | grep "Entry point address" | awk '{print $4}'` && \
        echo ${IMX_LOAD_ADDR} > ${B}/core/tee-init_load_addr.txt
    fi
}
