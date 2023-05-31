# Provides the i.MX6 SABRE AUTO common settings

require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv7a/tune-cortexa9.inc

SERIAL_CONSOLES = "115200;ttymxc3"

MACHINE_FIRMWARE:append:mx6-nxp-bsp = " linux-firmware-ath6k"

MACHINE_FEATURES += " pci wifi bluetooth nxp8987-sdio"
