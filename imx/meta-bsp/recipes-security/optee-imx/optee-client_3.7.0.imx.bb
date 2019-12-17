# Copyright (C) 2019 NXP

require recipes-security/optee-imx/optee-client_3.2.0.imx.bb

SRCBRANCH = "imx_3.7.y"
SRCREV = "bc0ec8ce1e4dc5ae23f4737ef659338b7cd408fe"
SRC_URI_remove = "file://0001-libteec-refactor-_dprintf.patch"

B = "${WORKDIR}/build"

EXTRA_OEMAKE_remove = "CFG_SECURE_DATA_PATH=y"
EXTRA_OEMAKE += "O=${B}"

do_install() {
    oe_runmake -C ${S} install

    install -D -p -m0755 ${B}/export/usr/sbin/tee-supplicant ${D}${bindir}/tee-supplicant

    install -D -p -m0644 ${B}/export/usr/lib/libteec.so.1.0 ${D}${libdir}/libteec.so.1.0
    ln -sf libteec.so.1.0 ${D}${libdir}/libteec.so
    ln -sf libteec.so.1.0 ${D}${libdir}/libteec.so.1

    cp -a ${B}/export/usr/include ${D}/usr/

    sed -i -e s:/etc:${sysconfdir}:g \
           -e s:/usr/bin:${bindir}:g \
              ${WORKDIR}/tee-supplicant.service

    install -D -p -m0644 ${WORKDIR}/tee-supplicant.service ${D}${systemd_system_unitdir}/tee-supplicant.service
}

