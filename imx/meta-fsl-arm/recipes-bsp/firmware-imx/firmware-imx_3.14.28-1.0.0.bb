# Copyright (C) 2012-2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI[md5sum] = "11ecdbf60b8d54e95f0482b307b54b34"
SRC_URI[sha256sum] = "8ba3434f7bedfb2394615fec62a70b3241bdf1a02ffdfff65d743191a152ff31"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
