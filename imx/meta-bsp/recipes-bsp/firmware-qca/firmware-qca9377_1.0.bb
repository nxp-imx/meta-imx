# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
DESCRIPTION = "Qualcomm Wi-Fi and Bluetooth firmware for modules such as QCA9377-3"
SECTION = "base"
LICENSE = "Proprietary"

require firmware-qca.inc

do_install () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    install -m 644 ${S}/1PJ_QCA9377-3/etc/bluetooth/firmware.conf ${D}${sysconfdir}/bluetooth

    # Install firmware files
    install -d ${D}${base_libdir}
    cp -r ${S}/1PJ_QCA9377-3/lib/firmware ${D}${base_libdir}
}


FILES_${PN} = " \
                ${sysconfdir}/bluetooth/firmware.conf \
                ${base_libdir}/firmware/qca \
                ${base_libdir}/firmware/wlan \
                ${base_libdir}/firmware/bdwlan30.bin \
                ${base_libdir}/firmware/otp30.bin \
                ${base_libdir}/firmware/qwlan30.bin \
                ${base_libdir}/firmware/utf30.bin \
                ${base_libdir}/firmware/utfbd30.bin \
"
