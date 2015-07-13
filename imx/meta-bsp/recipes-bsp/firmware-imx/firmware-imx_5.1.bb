# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=01ba08a2b77c3a0a9d0ab5d4d83fed64"

SRC_URI[md5sum] = "a067522747341ebfb1efd3065895a89b"
SRC_URI[sha256sum] = "3d8dce9ad0f439496f33a6e369b5a71aeb19b9824a785cc7e77fc40201a971c3"

# Install epdc firmware
PACKAGES += "${PN}-epdc"

do_install_append() {
    # Create symbol link for epdc firmware
    ln -sf epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc_ED060XH2C1.fw
}

FILES_${PN}-epdc += "${base_libdir}/firmware/imx/*"

COMPATIBLE_MACHINE = "(mx5|mx6|mx7)"
