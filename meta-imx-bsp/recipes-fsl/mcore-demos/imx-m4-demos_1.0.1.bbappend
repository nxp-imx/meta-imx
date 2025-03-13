do_install () {
    install -d ${D}${nonarch_base_libdir}/firmware
    if ls ${S}/*.elf > /dev/null 2>&1; then
        install -m 0644 ${S}/*.elf ${D}${nonarch_base_libdir}/firmware
    fi
    install -m 0644 ${S}/*.${MCORE_DEMO_FILE_EXTENSION} ${D}${nonarch_base_libdir}/firmware
}
