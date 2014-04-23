# Copyright (C) 2014 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

PE="1"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}_alpha.bin;fsl-eula=true"

S = "${WORKDIR}/firmware-imx-${PV}_alpha"

SRC_URI[md5sum] = "9bceac60eaf6d2617e6fbe38682b2579"
SRC_URI[sha256sum] = "55bad99e0060a28adb890007910826e134f60c530914f6126ec71548d3e18b48"

do_install() {
	install -d ${D}/lib/firmware
    cp -rfv firmware/* ${D}/lib/firmware/
    find ${D}/lib/firmware -type f -exec chmod 644 '{}' ';'

    # Remove files not going to be installed
     find ${D}/lib/firmware/ -name Android.mk -exec rm '{}' ';'
}

COMPATIBLE_MACHINE = "(mx6)"
