# Copyright 2017-2022 NXP
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

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
REV_OPTION:mx8ulp-generic-bsp = \
    "${@bb.utils.contains('MACHINE_FEATURES', 'soc-reva0', '', \
                                                           'REV=A1', d)}"
# Setting for i.MX 93
IMX_M4_DEMOS:mx9-nxp-bsp = ""
M4_DEFAULT_IMAGE:mx9-nxp-bsp = ""
ATF_MACHINE_NAME:mx9-nxp-bsp = "bl31-imx93.bin"
IMX_EXTRA_FIRMWARE:mx9-nxp-bsp = " firmware-imx-9 firmware-sentinel"
SOC_TARGET:mx9-nxp-bsp = "iMX93"
SOC_FAMILY:mx9-nxp-bsp = "mx93"

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

compile_mx93() {
    bbnote i.MX 93 boot binary build
    for ddr_firmware in ${DDR_FIRMWARE_NAME}; do
        bbnote "Copy ddr_firmware: ${ddr_firmware} from ${DEPLOY_DIR_IMAGE} -> ${BOOT_STAGING} "
        cp ${DEPLOY_DIR_IMAGE}/${ddr_firmware}               ${BOOT_STAGING}
    done

    cp ${DEPLOY_DIR_IMAGE}/${SECO_FIRMWARE_NAME}             ${BOOT_STAGING}/
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/${ATF_MACHINE_NAME} ${BOOT_STAGING}/bl31.bin
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
        # Deploy STMM related files
        install -m 0644 ${BOOT_STAGING}/tee.bin-stmm        ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/capsule1.bin        ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/CRT.*               ${DEPLOYDIR}/${BOOT_TOOLS}

        install -m 0755 ${BOOT_STAGING}/mkeficapsule        ${DEPLOYDIR}/${BOOT_TOOLS}
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

deploy_mx93() {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}

    for ddr_firmware in ${DDR_FIRMWARE_NAME}; do
        install -m 0644 ${DEPLOY_DIR_IMAGE}/${ddr_firmware}  ${DEPLOYDIR}/${BOOT_TOOLS}
    done

    install -m 0644 ${BOOT_STAGING}/${SECO_FIRMWARE_NAME}    ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0755 ${S}/${TOOLS_NAME}                       ${DEPLOYDIR}/${BOOT_TOOLS}
    if [ -e ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} ] ; then
        install -m 0644 ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} \
                                                             ${DEPLOYDIR}/${BOOT_TOOLS}
    fi
}

COMPATIBLE_MACHINE = "(mx8-generic-bsp|mx9-generic-bsp)"
