# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=01ba08a2b77c3a0a9d0ab5d4d83fed64"

SRC_URI[md5sum] = "470d5b8115cbcd745048d417450ed1b8"
SRC_URI[sha256sum] = "5a285205a006de4e390e7bcab87190b1b7b7758474930808c843f4062d7f54b3"

# Install epdc firmware
PACKAGES += "${PN}-epdc"

do_install_append() {
    # Move the folder epdc under /lib/firmware/imx
    install -d ${D}/lib/firmware/imx
    mv ${D}${base_libdir}/firmware/epdc ${D}${base_libdir}/firmware/imx/epdc
    # Create symbol link for epdc firmware
    rm -rf ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw
    ln -sf epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw
}

FILES_${PN}-epdc += "${base_libdir}/firmware/imx/epdc/*"

COMPATIBLE_MACHINE = "(mx5|mx6|mx7)"
