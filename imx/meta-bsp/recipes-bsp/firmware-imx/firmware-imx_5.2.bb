# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=01ba08a2b77c3a0a9d0ab5d4d83fed64"

SRC_URI[md5sum] = "66bf25951ec1cd064bd7389db1f28944"
SRC_URI[sha256sum] = "28018aea9897c75f3e55195925a2f5ef7e81a7eeae599972c623713f45bcf8d4"

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
