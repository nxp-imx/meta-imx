# Copyright (C) 2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-alpha.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}-alpha"

SRC_URI[md5sum] = "44ae0d7eba6aa3cf348a53b8e50565a5"
SRC_URI[sha256sum] = "e8cfc7f6eb7410c4421e12a64c6ad1ef8396feac90216d0d13f01739d4928438"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
