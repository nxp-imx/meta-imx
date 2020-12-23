# Copyright (C) 2020 NXP
require optee-os.imx.inc

DEPENDS_append = " python3-pycryptodomex-native"

OPTEE_OS_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-os.git;protocol=https"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH}"

SRCBRANCH = "lf-5.10.y_1.0.0"
SRCREV = "87b3b15498f07a9e4d3da3977722a506d1fa9509" 

# tee-init_load_addr.txt has been remove in lates optee-os version.
# to keep backward compatibility with existing optee-os recipe.
do_compile_append () {
    if [ "${OPTEE_ARCH}" != "arm64" ]; then
        IMX_LOAD_ADDR=`${TARGET_PREFIX}readelf -h ${B}/core/tee.elf | grep "Entry point address" | awk '{print $4}'` && \
        echo ${IMX_LOAD_ADDR} > ${B}/core/tee-init_load_addr.txt
    fi
}
