# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.y"
LOCALVERSION = "-3.0.0"
SRCREV = "27bd4cf46d397566cea140dbca41b6e619a15f09"
KERNEL_SRC ?= "git://git.freescale.com/imx/linux-imx.git;protocol=git"

SRCBRANCH_imx7ulp_zebu = "imx_4.1.y_imx7ulp"
LOCALVERSION_imx7ulp_zebu = "-mx7ulp"
SRCREV_imx7ulp_zebu = "ffd160f175e96052550f6f169bf0f67f41b2e9a9"
KERNEL_SRC_imx7ulp_zebu = "git://sw-stash.freescale.net/scm/imx/linux-2.6-testbuild.git;protocol=http"

SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

DO_CONFIG_V7_COPY = "no"
DO_CONFIG_V7_COPY_mx6 = "yes"
DO_CONFIG_V7_COPY_mx7 = "yes"
DO_CONFIG_V7_COPY_nx6sll = "yes"
DO_CONFIG_V7_COPY_mx6ull = "yes"

DO_CONFIG_V7_COPY_imx7ulp_zebu = "no"

DO_CONFIG_7ULP_COPY = "no"
DO_CONFIG_7ULP_COPY_imx7ulp_zebu = "yes"

addtask copy_defconfig after do_patch before do_preconfigure #do_configure
do_copy_defconfig () {
    install -d ${B}
    if [ ${DO_CONFIG_V7_COPY} = "yes" ]; then
        # copy latest imx_v7_defconfig to use for mx6, mx6ul and mx7
        mkdir -p ${B}
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
    fi

    if [ ${DO_CONFIG_7ULP_COPY} = "yes" ]; then
        # temporal work-around for GPU KLM build error
        echo "CONFIG_MODULES=y" >>  ${S}/arch/arm/configs/mx7ulp_defconfig

        cp ${S}/arch/arm/configs/mx7ulp_defconfig ${B}/.config
        cp ${S}/arch/arm/configs/mx7ulp_defconfig ${B}/../defconfig
    fi

}

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
