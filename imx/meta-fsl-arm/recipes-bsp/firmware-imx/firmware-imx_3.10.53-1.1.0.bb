# Copyright (C) 2012-2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}"

SRC_URI[md5sum] = "4e102affc4273f424da4cec9f46adae8"
SRC_URI[sha256sum] = "8fcfc713321c4ffaafee248feb392b7bc9b913b7abee5020fceaca1d1a49ac99"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
