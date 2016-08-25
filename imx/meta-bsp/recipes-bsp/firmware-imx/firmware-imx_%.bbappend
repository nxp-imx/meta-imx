# Copyright (C) 2012-2016 Freescale Semiconductor

#BRCM firmware git
SRCBRANCH ?= "master"

SRC_URI_append = " \
           git://git.freescale.com/imx/imx-firmware.git;branch=${SRCBRANCH};destsuffix=${S}/git "

SRCREV = "951c1363abe95dd75ab3e9447f640d7807240236"

# i.MX Kernel has the built-in Wi-Fi driver which has hardcoded
#  the firmware path as /lib/firmware/bcm
do_install_append() {
    install -d ${D}${base_libdir}/firmware/bcm
    install -d ${D}${sysconfdir}/firmware

    #1BW_BCM43340
    cp -rfv git/brcm/1BW_BCM43340/*.bin ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/1BW_BCM43340/*.cal ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/1BW_BCM43340/*.hcd ${D}${sysconfdir}/firmware/

    #1DX_BCM4343W
    cp -rfv git/brcm/1DX_BCM4343W/*.bin ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/1DX_BCM4343W/*.cal ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/1DX_BCM4343W/*.hcd ${D}${sysconfdir}/firmware/

    #SN8000_BCM43362
    cp -rfv git/brcm/SN8000_BCM43362/*.bin ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/SN8000_BCM43362/*.cal ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/1DX_BCM4343W/*.hcd ${D}${sysconfdir}/firmware/

    #ZP_BCM4339
    cp -rfv git/brcm/ZP_BCM4339/*.bin ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/ZP_BCM4339/*.cal ${D}${base_libdir}/firmware/bcm
    cp -rfv git/brcm/ZP_BCM4339/*.hcd ${D}${sysconfdir}/firmware/

    find ${D}${base_libdir}/firmware -type f -exec chmod 644 '{}' ';'
    find ${D}${base_libdir}/firmware -type f -exec chown root:root '{}' ';'

    # Remove files not going to be installed
    find ${D}${base_libdir}/firmware/ -name '*.mk' -exec rm '{}' ';'
}

PACKAGES =+ "${PN}-brcm"

FILES_${PN}-brcm = "${base_libdir}/firmware/bcm/*.bin ${base_libdir}/firmware/bcm/*.cal ${sysconfdir}/firmware/"
