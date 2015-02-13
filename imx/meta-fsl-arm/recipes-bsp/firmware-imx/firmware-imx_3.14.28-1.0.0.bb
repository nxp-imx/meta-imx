# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://EULA.txt;md5=acdb807ac7275fe32f9f64992e111241"

PE="1"

SRC_URI[md5sum] = "eb24f23aafb5a7f4a6a822eb202db33b"
SRC_URI[sha256sum] = "4f0311553c908a5a1edefe50b7e460d0530e98ffab1e4ab2f69a1cd7ccf662aa"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
