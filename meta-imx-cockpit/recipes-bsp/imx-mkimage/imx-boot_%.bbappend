BOOT_CONFIG_MACHINE:imx8qm-cockpit = "${BOOT_NAME}-imx8qmmek-${UBOOT_CONFIG}.bin"
MACHINE_COCKPIT = "imx8qm-cockpit-mek"

do_compile:imx8qm-cockpit () {
    bbnote 8QM cockpit boot binary build

    cp ${DEPLOY_DIR_IMAGE}/imx8qm_m4_TCM_power_mode_switch_m40.bin   ${BOOT_STAGING}/m4_image.bin
    cp ${DEPLOY_DIR_IMAGE}/imx8qm_m4_TCM_power_mode_switch_m41.bin   ${BOOT_STAGING}/m4_1_image.bin

    cp ${DEPLOY_DIR_IMAGE}/${SECO_FIRMWARE_NAME} ${BOOT_STAGING}

    cp ${DEPLOY_DIR_IMAGE}/u-boot-${MACHINE_COCKPIT}.bin-a53    ${BOOT_STAGING}/u-boot.bin
    cp ${DEPLOY_DIR_IMAGE}/u-boot-${MACHINE_COCKPIT}.bin-a72    ${BOOT_STAGING}/u-boot-a72.bin
    if ${DEPLOY_OPTEE}; then
        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/mx8qm-mek_cockpit-scfw-tcm.bin  ${BOOT_STAGING}/scfw_tcm.bin

        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a53   ${BOOT_STAGING}/bl31.bin
        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-optee-a72   ${BOOT_STAGING}/bl31-a72.bin

        cp ${DEPLOY_DIR_IMAGE}/${MLPREFIX}optee/tee-a53.bin ${BOOT_STAGING}/tee.bin
        cp ${DEPLOY_DIR_IMAGE}/${MLPREFIX}optee/tee-a72.bin ${BOOT_STAGING}

        cp ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE_COCKPIT}-a53   ${BOOT_STAGING}/u-boot-spl.bin
        cp ${DEPLOY_DIR_IMAGE}/u-boot-spl.bin-${MACHINE_COCKPIT}-a72   ${BOOT_STAGING}/u-boot-spl-a72.bin

        make SOC=iMX8QM flash_cockpit_spl
        if [ -e "${BOOT_STAGING}/flash.bin" ]; then
           cp ${BOOT_STAGING}/flash.bin ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit_spl
        else
           bbnote ${BOOT_STAGING}/flash.bin does not exist
        fi
    else
        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/mx8qm-mek_cockpit-nospl-scfw-tcm.bin  ${BOOT_STAGING}/scfw_tcm.bin

        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a53   ${BOOT_STAGING}/bl31.bin
        cp ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/bl31-imx8qm-cockpit.bin-a72   ${BOOT_STAGING}/bl31-a72.bin

        make SOC=iMX8QM flash_cockpit
        if [ -e "${BOOT_STAGING}/flash.bin" ]; then
           cp ${BOOT_STAGING}/flash.bin ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit
        else
           bbnote ${BOOT_STAGING}/flash.bin does not exist
        fi
    fi
}

do_install:imx8qm-cockpit () {
    install -d ${D}/boot
    if ${DEPLOY_OPTEE}; then
      install -m 0644 ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit_spl ${D}/boot/
    else
      install -m 0644 ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit ${D}/boot/
    fi
}

do_deploy:imx8qm-cockpit() {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${BOOT_STAGING}/${SECO_FIRMWARE_NAME}    ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${BOOT_STAGING}/m4_image.bin             ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${BOOT_STAGING}/m4_1_image.bin           ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0755 ${S}/${TOOLS_NAME}                       ${DEPLOYDIR}/${BOOT_TOOLS}
    # copy makefile (soc.mak) for reference
    install -m 0644 ${BOOT_STAGING}/soc.mak                  ${DEPLOYDIR}/${BOOT_TOOLS}
    if "${DEPLOY_OPTEE}"; then
        install -m 0644 ${DEPLOY_DIR_IMAGE}/tee.bin          ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/u-boot-spl.bin       ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/u-boot-spl-a72.bin   ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit_spl ${DEPLOYDIR}
        cd ${DEPLOYDIR}
        ln -sf imx-boot-imx8qmmek-sd.bin-flash_cockpit_spl ${BOOT_NAME}
        cd -
    else
        install -m 0644 ${BOOT_STAGING}/u-boot.bin           ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/u-boot-a72.bin       ${DEPLOYDIR}/${BOOT_TOOLS}
        install -m 0644 ${BOOT_STAGING}/imx-boot-imx8qmmek-sd.bin-flash_cockpit ${DEPLOYDIR}
        cd ${DEPLOYDIR}
        ln -sf imx-boot-imx8qmmek-sd.bin-flash_cockpit ${BOOT_NAME}
        cd -
    fi
}
