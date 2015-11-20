# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

SRC_URI[md5sum] = "1f19ffcbd6f8c3fcde271cf6f0314836"
SRC_URI[sha256sum] = "fd14c3666eb3c12f4f2665d95caf383bb1d0277bb12e2de28fefc8d1230604f2"

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

COMPATIBLE_MACHINE = "(mx5|mx6|mx7|mx6ul)"
