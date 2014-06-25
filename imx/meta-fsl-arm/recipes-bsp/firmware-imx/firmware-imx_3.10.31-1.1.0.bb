# Copyright (C) 2012-2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}-beta.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}-beta"

SRC_URI[md5sum] = "52606ff6d40ec713bca96f3d41928ec0"
SRC_URI[sha256sum] = "4a0a1dcc5a2789826767e5abe65ecc1bd4038721fe6d1eaeaa9c6acb1364c5b8"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
