DELTA_KERNEL_DEFCONFIG_COCKPIT = "imx8qm_cockpit.config"

#make imx_v8_defconfig imx8qm_cockpit.config; make

# combine 2 defconfigs for cockpit
do_copy_defconfig:append:imx8qm-cockpit () {

    sed -i "/CONFIG_IMX_SHMEM_NET[ =]/d"  ${B}/.config
    sed -i "/CONFIG_GIC_GENTLE_CONFIG[ =]/d"  ${B}/.config
    sed -i "/CONFIG_PANIC_TIMEOUT[ =]/d"  ${B}/.config

    echo "CONFIG_IMX_SHMEM_NET=y" >>  ${B}/.config
    echo "CONFIG_GIC_GENTLE_CONFIG=y" >>  ${B}/.config
    echo "CONFIG_PANIC_TIMEOUT=-1" >>  ${B}/.config
}
