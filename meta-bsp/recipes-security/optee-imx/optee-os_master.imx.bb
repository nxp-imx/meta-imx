# Copyright (C) 2020 NXP
require optee-os.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "master"
SRCREV = "df24e6517b6454cf906c16979ea0e7546c5c99d5"

# tee-init_load_addr.txt has been remove in lates optee-os version. Generate it before the deploy 
# to keep backward compatibility with existing optee-os recipe.
do_deploy_prepend () {
    if [ "${OPTEE_ARCH}" != "arm64" ]; then
        IMX_LOAD_ADDR=`${TARGET_PREFIX}readelf -h ${B}/core/tee.elf | grep "Entry point address" | awk '{print $4}'` && \
        echo ${IMX_LOAD_ADDR} > ${B}/core/tee-init_load_addr.txt
    fi
}
