do_configure:append() {
    rm -f ${B}/build/${OEI_BOARD}/ddr/oei-m33-ddr-ecc.bin
}

do_compile:append() {
    # Store the ECC version with an ECC-specific name for our test infrastructure
    if [ "${@bb.utils.filter('PACKAGECONFIG', 'ecc', d)}" ]; then
        mv ${B}/build/${OEI_BOARD}/ddr/oei-m33-ddr.bin \
            ${B}/build/${OEI_BOARD}/ddr/oei-m33-ddr-ecc.bin
        ln -s oei-m33-ddr-ecc.bin \
            ${B}/build/${OEI_BOARD}/ddr/oei-m33-ddr.bin
    fi
}
