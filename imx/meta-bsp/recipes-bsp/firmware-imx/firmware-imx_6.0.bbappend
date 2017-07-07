# Copyright 2017 NXP

#BRCM firmware v1.141.100.6
IMX_FIRMWARE_SRC ?= "git://git.freescale.com/imx/imx-firmware.git;protocol=git"
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
           ${IMX_FIRMWARE_SRC};branch=${SRCBRANCH};destsuffix=${S}/git "

SRCREV = "c82056b55eddd7b3de8d4699b33a8f8099450833"

do_install() {
    install -d ${D}${base_libdir}/firmware/imx
    install -d ${D}${base_libdir}/firmware/bcm
    install -d ${D}${sysconfdir}/firmware

    cp -rfv firmware/* ${D}${base_libdir}/firmware/

    #1BW_BCM43340
    install -d ${D}${base_libdir}/firmware/bcm/1BW_BCM43340
    cp -rfv git/brcm/1BW_BCM43340/*.bin ${D}${base_libdir}/firmware/bcm/1BW_BCM43340
    cp -rfv git/brcm/1BW_BCM43340/*.hcd ${D}${sysconfdir}/firmware/

    #1DX_BCM4343W
    install -d ${D}${base_libdir}/firmware/bcm/1DX_BCM4343W
    cp -rfv git/brcm/1DX_BCM4343W/*.bin ${D}${base_libdir}/firmware/bcm/1DX_BCM4343W
    cp -rfv git/brcm/1DX_BCM4343W/*.hcd ${D}${sysconfdir}/firmware/

    #SN8000_BCM43362
    install -d ${D}${base_libdir}/firmware/bcm/SN8000_BCM43362
    cp -rfv git/brcm/SN8000_BCM43362/*.bin ${D}${base_libdir}/firmware/bcm/SN8000_BCM43362
    cp -rfv git/brcm/1DX_BCM4343W/*.hcd ${D}${sysconfdir}/firmware/

    #ZP_BCM4339
    install -d ${D}${base_libdir}/firmware/bcm/ZP_BCM4339
    cp -rfv git/brcm/ZP_BCM4339/*.bin ${D}${base_libdir}/firmware/bcm/ZP_BCM4339
    cp -rfv git/brcm/ZP_BCM4339/*.hcd ${D}${sysconfdir}/firmware/

    mv ${D}${base_libdir}/firmware/epdc/ ${D}${base_libdir}/firmware/imx/epdc/
    mv ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw

    find ${D}${base_libdir}/firmware -type f -exec chmod 644 '{}' ';'
    find ${D}${base_libdir}/firmware -type f -exec chown root:root '{}' ';'

    # Remove files not going to be installed
    find ${D}${base_libdir}/firmware/ -name '*.mk' -exec rm '{}' ';'
}
