# Copyright (C) 2012-2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}"

SRC_URI[md5sum] = "b15ce0e8d2acb4ad694d7c0b835678ef"
SRC_URI[sha256sum] = "32391ce725657a74d69c448556c62afc3d3dafed55aa1a20de257a07171cb151"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
