# Copyright 2017 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
            file://firmware.conf \
"

do_install_append () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    cp ${WORKDIR}/firmware.conf ${D}${sysconfdir}/bluetooth
}

FILES_${PN}-qca += " \
  ${sysconfdir}/bluetooth/firmware.conf \
"
