require optee-os-imx.inc

do_install:append () {
    # Install embedded TAs
    install -d ${D}${nonarch_base_libdir}/optee_armtz/
    install -m 444 ${B}/ta/*/*.ta ${D}${nonarch_base_libdir}/optee_armtz/
}

do_deploy:append() {
    cp ${B}/core/tee-raw.bin ${DEPLOYDIR}/tee.${PLATFORM_FLAVOR}.bin
    ln -sf tee.${PLATFORM_FLAVOR}.bin ${DEPLOYDIR}/tee.bin
}

do_deploy:append:arm() {
    cp ${B}/core/uTee ${DEPLOYDIR}/uTee-${OPTEE_BIN_EXT}
}

FILES:${PN} += "${nonarch_base_libdir}/optee_armtz"
