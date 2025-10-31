# Copyright 2017-2025 NXP
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

IMX_M4_DEMOS      = ""
IMX_M4_DEMOS:mx8-nxp-bsp  = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS:mx8m-nxp-bsp = ""
IMX_M4_DEMOS:mx8ulp-nxp-bsp = "imx-m33-demos:do_deploy"
IMX_M4_DEMOS:mx91-nxp-bsp = ""
IMX_M4_DEMOS:mx93-nxp-bsp = ""
IMX_M4_DEMOS:mx943-nxp-bsp = "imx-mcore-demos:do_deploy"
IMX_M4_DEMOS:mx95-nxp-bsp = "imx-m7-demos:do_deploy"

M4_DEFAULT_IMAGE ?= "m4_image.bin"
M4_DEFAULT_IMAGE:mx8qxp-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dxl-nxp-bsp = "imx8dxl_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dx-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8ulp-nxp-bsp = "imx8ulp_m33_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx91-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx93-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx943-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx95-nxp-bsp = "${M4_DEFAULT_IMAGE_MX95}"

do_compile[depends] += "${IMX_M4_DEMOS}"

do_compile:prepend() {
    case ${SOC_FAMILY} in
    mx8)
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/imx8qm_m4_TCM_power_mode_switch_m40.bin \
                                                             ${BOOT_STAGING}/m4_image.bin
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/imx8qm_m4_TCM_power_mode_switch_m41.bin \
                                                             ${BOOT_STAGING}/m4_1_image.bin
        ;;
    mx8x)
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M4_DEFAULT_IMAGE}           ${BOOT_STAGING}/m4_image.bin
        ;;
    mx8ulp)
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M4_DEFAULT_IMAGE}       ${BOOT_STAGING}/m33_image.bin
        ;;
    mx943)
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M33_IMAGE} ${BOOT_STAGING}/m33s_image.bin
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M70_IMAGE} ${BOOT_STAGING}/m70_image.bin
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M71_IMAGE} ${BOOT_STAGING}/m71_image.bin
    ;;
    mx95)
        cp ${DEPLOY_DIR_IMAGE}/mcore-demos/${M4_DEFAULT_IMAGE}           ${BOOT_STAGING}/m7_image.bin
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
    mx943)
        install -m 0644 ${DEPLOY_DIR_IMAGE}/mcore-demos/${M33_IMAGE}                ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${DEPLOY_DIR_IMAGE}/mcore-demos/${M70_IMAGE}                ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${DEPLOY_DIR_IMAGE}/mcore-demos/${M71_IMAGE}                ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    mx95)
        install -m 0644 ${DEPLOY_DIR_IMAGE}/mcore-demos/${M4_DEFAULT_IMAGE}         ${DEPLOYDIR}/${BOOT_TOOLS}
        ;;
    esac
}
