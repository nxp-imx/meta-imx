DELTA_KERNEL_DEFCONFIG_COCKPIT = "imx8qm_cockpit.config"

#make imx_v8_defconfig imx8qm_cockpit.config; make

# combine 2 defconfigs for cockpit
do_copy_defconfig_imx8qm-cockpit () {
    install -d ${B}
    mkdir -p ${B}
    cat ${S}/arch/arm64/configs/${IMX_KERNEL_CONFIG_AARCH64} ${S}/arch/arm64/configs/${DELTA_KERNEL_DEFCONFIG_COCKPIT} > ${B}/.config
}
