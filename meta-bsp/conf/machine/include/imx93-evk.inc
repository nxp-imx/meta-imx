require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv8-2a/tune-cortexa55.inc

MACHINE_FEATURES += "pci wifi bluetooth"

KERNEL_DEVICETREE = " \
    freescale/${KERNEL_DEVICETREE_BASENAME}.dtb \
"
UBOOT_DTB_NAME = "${KERNEL_DEVICETREE_BASENAME}.dtb"

IMX_DEFAULT_BOOTLOADER:use-nxp-bsp = "u-boot-imx"
IMX_DEFAULT_BOOTLOADER:use-mainline-bsp = "u-boot-fslc"

LOADADDR = ""
UBOOT_SUFFIX = "bin"
UBOOT_MAKE_TARGET = ""

SPL_BINARY = "spl/u-boot-spl.bin"

UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd]   = "${UBOOT_CONFIG_BASENAME}_defconfig,sdcard"
UBOOT_CONFIG[fspi] = "${UBOOT_CONFIG_BASENAME}_defconfig"

# Set ATF platform name
ATF_PLATFORM = "imx93"

IMXBOOT_TARGETS_SD   = "flash_singleboot"
IMXBOOT_TARGETS_FSPI = "flash_singleboot_m33_flexspi flash_dualboot_flexspi"

IMXBOOT_TARGETS = "${@bb.utils.contains('UBOOT_CONFIG',   'sd', '${IMXBOOT_TARGETS_SD}', \
                                                                '${IMXBOOT_TARGETS_FSPI}', d)}"

IMX_BOOT_SOC_TARGET = "iMX9"
IMX_BOOT_SEEK = "32"

# We have to disable SERIAL_CONSOLE due to auto-serial-console
SERIAL_CONSOLES = "115200;ttyLP0"

# Add additional firmware
#MACHINE_FIRMWARE:append = " firmware-imx-epdc"
