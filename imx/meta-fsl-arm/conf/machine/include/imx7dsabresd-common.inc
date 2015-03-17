# Provides the i.MX7D SABRE SD common settings

require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa7.inc

DEFAULTTUNE_mx7 ?= "cortexa7hf-neon"

UBOOT_ENTRYPOINT_mx7 = "0x80008000"

SDCARD_GENERATION_COMMAND_mx7 = "generate_imx_sdcard"

SERIAL_CONSOLE = "115200 ttymxc0"

#MACHINE_FIRMWARE_append_mx6 = " linux-firmware-ath6k"

MACHINE_FEATURES += " pci wifi bluetooth"


