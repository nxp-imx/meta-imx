# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
DESCRIPTION = "Qualcomm Wi-Fi and Bluetooth firmware for modules such as QCA9377-3"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

inherit fsl-eula-unpack allarch

SRC_URI = " ${INTERNAL_MIRROR}/firmware-qca-1.0.bin;fsl-eula=true; \
"
SRC_URI[md5sum] = "be4f9ca9059a1546af70db3fd6d990c7"
SRC_URI[sha256sum] = "5dfe3ea15aaf8bfc8a20dfccae72317b6c2162c82e12e8e0780996b468e8fee1"

do_install () {
    # Install firmware.conf for QCA modules
    install -d ${D}${sysconfdir}/bluetooth
    cp ${S}/1PJ_QCA9377-3/etc/bluetooth/firmware.conf ${D}${sysconfdir}/bluetooth

    # Install firmware files
    install -d ${D}${base_libdir}
    cp -r ${S}/1PJ_QCA9377-3/lib/firmware ${D}${base_libdir}
    find ${D}${base_libdir} -name CadenceLicense.txt -exec rm {} \;
    find ${D}${base_libdir} -name Notice.txt -exec rm {} \;
}

PACKAGES += "${PN}-9377-3"

ALLOW_EMPTY_${PN} = "1"

FILES_${PN} = ""
FILES_${PN}-9377-3 = " \
                ${sysconfdir}/bluetooth/firmware.conf \
                ${base_libdir}/firmware/qca \
                ${base_libdir}/firmware/wlan \
                ${base_libdir}/firmware/bdwlan30.bin \
                ${base_libdir}/firmware/otp30.bin \
                ${base_libdir}/firmware/qwlan30.bin \
                ${base_libdir}/firmware/utf30.bin \
                ${base_libdir}/firmware/utfbd30.bin \
"
