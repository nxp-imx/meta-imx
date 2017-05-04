# Copyright 2017 NXP

#BRCM firmware v1.141.100.6
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
           git://sw-stash.freescale.net/scm/imx/imx-firmware.git;protocol=http;branch=${SRCBRANCH};destsuffix=${S}/git "

SRCREV = "4b3dd61998a533325726c9bc2a53673ce9459123"

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
