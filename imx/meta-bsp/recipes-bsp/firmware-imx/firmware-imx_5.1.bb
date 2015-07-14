# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=01ba08a2b77c3a0a9d0ab5d4d83fed64"

SRC_URI[md5sum] = "3bd61b7c1de2472214133654abddef2a"
SRC_URI[sha256sum] = "b8aa2fbfb16cafb82c6baa01337c109bdd39f698491922635dc40f1e66cf8927"

# Install epdc firmware
PACKAGES += "${PN}-epdc"

do_install_append() {
    # Create symbol link for epdc firmware
    rm -rf ${D}${base_libdir}/firmware/imx/epdc_ED060XH2C1.fw
    ln -sf epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc_ED060XH2C1.fw
}

FILES_${PN}-epdc += "${base_libdir}/firmware/imx/*"

COMPATIBLE_MACHINE = "(mx5|mx6|mx7)"
