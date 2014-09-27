# Copyright (C) 2012-2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}"

SRC_URI[md5sum] = "0ac17aabd4849a68b96fd23d92eac566"
SRC_URI[sha256sum] = "c83a368432d8725d16679c08726b293d09ff6c4a12a0ead44a2ee46c70cd542a"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
