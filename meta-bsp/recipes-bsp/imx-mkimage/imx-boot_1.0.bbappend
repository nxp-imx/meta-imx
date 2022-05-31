# Copyright 2017-2022 NXP
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

require imx-mkimage_git.inc

DEPLOY_OPTEE_STMM = "${@bb.utils.contains('MACHINE_FEATURES', 'optee stmm', 'true', 'false', d)}"

IMX_M4_DEMOS      = ""
IMX_M4_DEMOS:mx8-nxp-bsp  = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS:mx8m-nxp-bsp = ""

M4_DEFAULT_IMAGE ?= "m4_image.bin"
M4_DEFAULT_IMAGE:mx8qxp-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dxl-nxp-bsp = "imx8dxl_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dx-nxp-bsp = "imx8qx_m4_TCM_power_mode_switch.bin"

# Setting for i.MX 8ULP
IMX_M4_DEMOS:mx8ulp-nxp-bsp = "imx-m33-demos:do_deploy"
M4_DEFAULT_IMAGE:mx8ulp-nxp-bsp = "imx8ulp_m33_TCM_power_mode_switch.bin"
ATF_MACHINE_NAME:mx8ulp-nxp-bsp = "bl31-imx8ulp.bin"
IMX_EXTRA_FIRMWARE:mx8ulp-nxp-bsp = "firmware-upower firmware-sentinel"
SOC_TARGET:mx8ulp-nxp-bsp = "iMX8ULP"
SOC_FAMILY:mx8ulp-nxp-bsp = "mx8ulp"

REV_OPTION:mx8dxl-nxp-bsp = "ERROR_8DXL_REV_AMBIGUOUS"
REV_OPTION:mx8dxlb0-nxp-bsp = "REV=B0"
REV_OPTION:mx8dxla1-nxp-bsp = "REV=A1"

IS_DXL                = "false"
IS_DXL:mx8dxl-nxp-bsp = "true"

do_compile[depends] += "${IMX_M4_DEMOS}"

do_compile:prepend() {
    if ${IS_DXL}; then
        bbwarn "!!! Booting with an image for the wrong DXL Rev will PERMANENTLY DAMAGE YOUR BOARD !!!"
    fi
    if [ "${REV_OPTION}" = "ERROR_8DXL_REV_AMBIGUOUS" ]; then
        bbfatal "Machine ${MACHINE} cannot be used. Please select a machine with the correct Rev for your board."
    fi
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
    esac
}

compile_mx8ulp() {
    bbnote 8ULP boot binary build
    cp ${DEPLOY_DIR_IMAGE}/${SECO_FIRMWARE_NAME}             ${BOOT_STAGING}/
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/${ATF_MACHINE_NAME} ${BOOT_STAGING}/bl31.bin
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/upower.bin          ${BOOT_STAGING}/upower.bin
    cp ${DEPLOY_DIR_IMAGE}/${UBOOT_NAME}                     ${BOOT_STAGING}/u-boot.bin
    if [ -e ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} ] ; then
        cp ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} \
                                                             ${BOOT_STAGING}/u-boot-spl.bin
    fi
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
    esac

    if ${DEPLOY_OPTEE_STMM}; then
        # Rename tee.bin to tee.bin-stmm
        mv ${DEPLOYDIR}/${BOOT_TOOLS}/tee.bin ${DEPLOYDIR}/${BOOT_TOOLS}/tee.bin-stmm
        # Rename flash.bin name with postfix "_stmm"
        for target in ${IMXBOOT_TARGETS}; do
            mv ${DEPLOYDIR}/${BOOT_CONFIG_MACHINE}-${target} ${DEPLOYDIR}/${BOOT_CONFIG_MACHINE}-${target}_stmm
        done
    fi

}

deploy_mx8ulp() {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${BOOT_STAGING}/${SECO_FIRMWARE_NAME}    ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0755 ${S}/${TOOLS_NAME}                       ${DEPLOYDIR}/${BOOT_TOOLS}
    if [ -e ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} ] ; then
        install -m 0644 ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} \
                                                             ${DEPLOYDIR}/${BOOT_TOOLS}
    fi
}
