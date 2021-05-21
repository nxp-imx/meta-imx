# Copyright 2017-2021 NXP

IMX_M4_DEMOS        = ""
IMX_M4_DEMOS_mx8qm  = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS_mx8x   = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS_mx8dxl = "imx-m4-demos:do_deploy"

M4_DEFAULT_IMAGE ?= "m4_image.bin"
M4_DEFAULT_IMAGE_mx8qxp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE_mx8dxl = "imx8dxl_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE_mx8dx = "imx8qx_m4_TCM_power_mode_switch.bin"

do_compile[depends] += "${IMX_M4_DEMOS}"

do_compile_prepend() {
    case ${SOC_FAMILY} in
    mx8)
        cp ${DEPLOY_DIR_IMAGE}/imx8qm_m4_TCM_power_mode_switch_m40.bin \
                                                             ${BOOT_STAGING}/m4_image.bin
        cp ${DEPLOY_DIR_IMAGE}/imx8qm_m4_TCM_power_mode_switch_m41.bin \
                                                             ${BOOT_STAGING}/m4_1_image.bin
        ;;
    mx8x)
        cp ${DEPLOY_DIR_IMAGE}/${M4_DEFAULT_IMAGE}           ${BOOT_STAGING}/m4_image.bin
        ;;
    esac
}

do_deploy_append() {
    case ${SOC_FAMILY} in
    mx8)
        install -m 0644 ${BOOT_STAGING}/m4_image.bin         ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/m4_1_image.bin       ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    mx8x)
        install -m 0644 ${BOOT_STAGING}/m4_image.bin         ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    esac
}
