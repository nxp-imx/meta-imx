# Copyright 2017-2018 NXP

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
            file://firmware.conf \
            git://github.com/murata-wireless/qca-linux-calibration.git;protocol=https;name=murata;destsuffix=git/murata \
"
SRCREV_murata = "a0026b646ce6adfb72f135ffa8a310f3614b2272"
SRCREV_FORMAT = "default_murata"

do_install_append () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    cp ${WORKDIR}/firmware.conf ${D}${sysconfdir}/bluetooth

    # Use Murata's QCA calibration files
    install -m 0644 ${S}/murata/1CQ/board.bin ${D}${nonarch_base_libdir}/firmware/ath10k/QCA6174/hw3.0/
}

FILES_${PN}-qca += " \
  ${sysconfdir}/bluetooth/firmware.conf \
"
