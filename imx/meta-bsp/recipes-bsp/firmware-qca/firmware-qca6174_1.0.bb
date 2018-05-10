# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
DESCRIPTION = "Qualcomm Wi-Fi and Bluetooth firmware for modules such as QCA6174A"
SECTION = "base"
LICENSE = "Proprietary"

require firmware-qca.inc

do_install () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    install -m 644 ${S}/1CQ_QCA6174A_LEA/etc/bluetooth/firmware.conf ${D}${sysconfdir}/bluetooth

    # Install firmware files
    install -d ${D}${base_libdir}
    cp -r ${S}/1CQ_QCA6174A_LEA/lib/firmware ${D}${base_libdir}
}


FILES_${PN} = " \
                ${sysconfdir}/bluetooth/firmware.conf \
                ${base_libdir}/firmware/wlan \
                ${base_libdir}/firmware/bdwlan30.bin \
                ${base_libdir}/firmware/otp30.bin \
                ${base_libdir}/firmware/qwlan30.bin \
                ${base_libdir}/firmware/nvm_tlv_3.2.bin \
                ${base_libdir}/firmware/rampatch_tlv_3.2.tlv\
"
