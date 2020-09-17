# Copyright (C) 2020 NXP
require optee-os.imx.inc

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-freescale/recipes-security/optee-imx/${PN}:"

DEPENDS_append = " python3-pycryptodomex-native"

SRCBRANCH = "imx_3.10.y"
SRCREV = "e2e1adfa0a8401d575641caa0692f07997e7eca8"

# tee-init_load_addr.txt has been remove in lates optee-os version.
# to keep backward compatibility with existing optee-os recipe.
do_compile_append () {
    if [ "${OPTEE_ARCH}" != "arm64" ]; then
        IMX_LOAD_ADDR=`${TARGET_PREFIX}readelf -h ${B}/core/tee.elf | grep "Entry point address" | awk '{print $4}'` && \
        echo ${IMX_LOAD_ADDR} > ${B}/core/tee-init_load_addr.txt
    fi
}
