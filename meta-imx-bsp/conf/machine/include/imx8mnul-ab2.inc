MACHINEOVERRIDES =. "mx8mnul:"

require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv8a/tune-cortexa53.inc

MACHINE_FEATURES += "wifi bluetooth bcm43455 bcm4356"

# NXP BSP can consume proprietary jailhouse and Broadcom drivers
# OP-TEE is also applicable to NXP BSP, mainline BSP seems not to have
# a full support for it yet.
MACHINE_FEATURES:append:use-nxp-bsp = " jailhouse bcm4359 optee"

KERNEL_DEVICETREE = " \
	freescale/${KERNEL_DEVICETREE_BASENAME}.dtb \
"
UBOOT_DTB_NAME = "${KERNEL_DEVICETREE_BASENAME}.dtb"

IMX_DEFAULT_BOOTLOADER:use-nxp-bsp = "u-boot-imx"
IMX_DEFAULT_BOOTLOADER:use-mainline-bsp = "u-boot-fslc"

UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd]      = "${UBOOT_CONFIG_BASENAME}_defconfig,sdcard"
UBOOT_CONFIG[fspi]    = "${UBOOT_CONFIG_BASENAME}_defconfig"

SPL_BINARY = "spl/u-boot-spl.bin"

ATF_PLATFORM = "imx8mn"
ATF_LOAD_ADDR = "0x960000"

IMXBOOT_TARGETS = "${@bb.utils.contains('UBOOT_CONFIG', 'fspi', '${IMXBOOT_TARGETS_BASENAME}_flexspi', '${IMXBOOT_TARGETS_BASENAME}', d)}"

IMX_BOOT_SOC_TARGET = "iMX8MN"

SERIAL_CONSOLES = "115200;ttymxc1"

BOOT_SPACE = "65536"
LOADADDR = ""
UBOOT_SUFFIX = "bin"
UBOOT_MAKE_TARGET = "all"

# Image boot offset as defined in section 6.1.6.1 "Primary image offset and IVT offset" of
# i.MX 8M Nano Applications Processor Reference Manual, Rev. 0, 12/2019
# Doc ID: IMX8MNRM
IMX_BOOT_SEEK = "32"

OPTEE_BIN_EXT = "8mn"
TEE_LOAD_ADDR = "0x56000000"

# Add additional firmware
MACHINE_FIRMWARE:append = " linux-firmware-ath10k"
