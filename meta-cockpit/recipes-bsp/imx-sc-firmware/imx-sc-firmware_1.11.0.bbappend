do_deploy:append:imx8qm-cockpit () {
    install -Dm 0644 ${S}/mx8qm-mek_cockpit-nospl-scfw-tcm.bin ${DEPLOYDIR}/${BOOT_TOOLS}
    install -Dm 0644 ${S}/mx8qm-mek_cockpit-scfw-tcm.bin ${DEPLOYDIR}/${BOOT_TOOLS}

    ln -sf mx8qm-mek_cockpit-scfw-tcm.bin ${DEPLOYDIR}/${BOOT_TOOLS}/${symlink_name}
    ln -sf mx8qm-mek_cockpit-nospl-scfw-tcm.bin ${DEPLOYDIR}/${BOOT_TOOLS}/${symlink_name}_nospl
}
