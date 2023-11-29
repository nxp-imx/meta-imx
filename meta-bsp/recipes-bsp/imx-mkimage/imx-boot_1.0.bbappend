# Copyright 2017-2022 NXP
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

DEPLOY_OPTEE_STMM = "${@bb.utils.contains('MACHINE_FEATURES', 'optee stmm', 'true', 'false', d)}"

IMX_M4_DEMOS      = ""
IMX_M4_DEMOS:mx8-nxp-bsp  = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS:mx8m-nxp-bsp = ""
IMX_M4_DEMOS:mx8ulp-nxp-bsp = "imx-m33-demos:do_deploy"
IMX_M4_DEMOS:mx91-nxp-bsp = ""
IMX_M4_DEMOS:mx93-nxp-bsp = ""
IMX_M4_DEMOS:mx95-nxp-bsp = "imx-m7-demos:do_deploy"

M4_DEFAULT_IMAGE ?= "m4_image.bin"
M4_DEFAULT_IMAGE:mx8qxp-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dxl-nxp-bsp = "imx8dxl_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dx-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8ulp-nxp-bsp = "imx8ulp_m33_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx91-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx93-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx95-nxp-bsp = "imx95-19x19-evk_m7_TCM_rpmsg_lite_str_echo_rtos.bin"

do_compile[depends] += "${IMX_M4_DEMOS}"

do_compile:prepend() {
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
    mx8ulp)
        cp ${DEPLOY_DIR_IMAGE}/${M4_DEFAULT_IMAGE}       ${BOOT_STAGING}/m33_image.bin
        ;;
    mx95)
        cp ${DEPLOY_DIR_IMAGE}/${M4_DEFAULT_IMAGE}           ${BOOT_STAGING}/m7_image.bin
        ;;
    esac
}

do_deploy:append() {
    case ${SOC_FAMILY} in
    mx8)
        install -m 0644 ${BOOT_STAGING}/m4_image.bin         ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/m4_1_image.bin       ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    mx8x)
        install -m 0644 ${BOOT_STAGING}/m4_image.bin         ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    mx8ulp)
        install -m 0644 ${BOOT_STAGING}/m33_image.bin        ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    mx95)
        install -m 0644 ${BOOT_STAGING}/m7_image.bin         ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    esac

    if ${DEPLOY_OPTEE_STMM}; then
        # Deploy STMM related files
        install -m 0644 ${BOOT_STAGING}/tee.bin-stmm        ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/capsule1.bin        ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/CRT.*               ${DEPLOYDIR}/${BOOT_TOOLS}

        install -m 0755 ${BOOT_STAGING}/mkeficapsule        ${DEPLOYDIR}/${BOOT_TOOLS}
    fi

}
