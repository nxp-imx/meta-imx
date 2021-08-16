# Copyright 2017-2021 NXP

require imx-mkimage_git.inc

IMX_M4_DEMOS      = ""
IMX_M4_DEMOS:mx8  = "imx-m4-demos:do_deploy"
IMX_M4_DEMOS:mx8m = ""

M4_DEFAULT_IMAGE ?= "m4_image.bin"
M4_DEFAULT_IMAGE:mx8qxp = "imx8qx_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dxl = "imx8dxl_m4_TCM_power_mode_switch.bin"
M4_DEFAULT_IMAGE:mx8dx = "imx8qx_m4_TCM_power_mode_switch.bin"

# Setting for i.MX 8ULP
IMX_M4_DEMOS:mx8ulp = "imx-m33-demos:do_deploy"
M4_DEFAULT_IMAGE:mx8ulp = "imx8ulp_m33_TCM_rpmsg_lite_str_echo_rtos.bin"
ATF_MACHINE_NAME:mx8ulp = "bl31-imx8ulp.bin"
IMX_EXTRA_FIRMWARE:mx8ulp = "firmware-upower firmware-sentinel"
SECO_FIRMWARE_NAME:mx8ulp = "mx8ulpa0-ahab-container.img"
SOC_TARGET:mx8ulp = "iMX8ULP"
SOC_FAMILY:mx8ulp = "mx8ulp"


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
    esac
}

compile_mx8ulp() {
    bbnote 8ULP boot binary build
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/${ATF_MACHINE_NAME} ${BOOT_STAGING}/bl31.bin
    cp ${DEPLOY_DIR_IMAGE}/${UBOOT_NAME}                     ${BOOT_STAGING}/u-boot.bin
    if [ -e ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} ] ; then
        cp ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} \
                                                             ${BOOT_STAGING}/u-boot-spl.bin
    fi

    # Copy SECO F/W and upower.bin
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/${SECO_FIRMWARE_NAME}  ${BOOT_STAGING}/
    cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/upower.bin          ${BOOT_STAGING}/upower.bin
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

    # Append a tag to the bootloader image used in the SD card image
    cp ${DEPLOYDIR}/${BOOT_NAME}                             ${DEPLOYDIR}/${BOOT_NAME}-tagged
    ln -sf ${BOOT_NAME}-tagged                               ${DEPLOYDIR}/${BOOT_NAME}
    stat -L -cUUUBURNXXOEUZX7+A-XY5601QQWWZ%sEND ${DEPLOYDIR}/${BOOT_NAME} \
                                                          >> ${DEPLOYDIR}/${BOOT_NAME}
}

deploy_mx8ulp() {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0755 ${S}/${TOOLS_NAME}                       ${DEPLOYDIR}/${BOOT_TOOLS}
    if [ -e ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} ] ; then
        install -m 0644 ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE}-${UBOOT_CONFIG} \
                                                             ${DEPLOYDIR}/${BOOT_TOOLS}
    fi
}
