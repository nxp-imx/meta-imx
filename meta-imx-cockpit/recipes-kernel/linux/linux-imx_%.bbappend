
do_copy_defconfig:append:imx8qm-cockpit () {

    sed -i "/CONFIG_IMX_SHMEM_NET[ =]/d"  ${B}/.config
    sed -i "/CONFIG_GIC_GENTLE_CONFIG[ =]/d"  ${B}/.config
    sed -i "/CONFIG_PANIC_TIMEOUT[ =]/d"  ${B}/.config

    echo "CONFIG_IMX_SHMEM_NET=y" >>  ${B}/.config
    echo "CONFIG_GIC_GENTLE_CONFIG=y" >>  ${B}/.config
    echo "CONFIG_PANIC_TIMEOUT=-1" >>  ${B}/.config
}
