MACHINEOVERRIDES =. "mx943:"

require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv8-2a/tune-cortexa55.inc

MACHINE_FEATURES += "pci wifi bluetooth"
MACHINE_FEATURES:append:use-nxp-bsp = " optee dpdk nxpiw612-sdio nxp9098-pcie"

KERNEL_DEVICETREE = " \
    freescale/${KERNEL_DEVICETREE_BASENAME}.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-boe-wxga-lvds-panel.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-i2c-spi-slave.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-lpuart.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-mqs.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-pcie1-ep.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-pcie1-ep.dtbo \
    freescale/${KERNEL_DEVICETREE_BASENAME}-rpmsg.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-sgmii.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-sdwifi.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-xspi.dtb \
    freescale/${KERNEL_DEVICETREE_BASENAME}-rmii.dtb \
"
UBOOT_DTB_NAME = "${KERNEL_DEVICETREE_BASENAME}.dtb"

IMX_DEFAULT_BOOTLOADER:use-nxp-bsp = "u-boot-imx"
IMX_DEFAULT_BOOTLOADER:use-mainline-bsp = "u-boot-fslc"

LOADADDR = ""
UBOOT_SUFFIX = "bin"
UBOOT_MAKE_TARGET = ""

SPL_BINARY = "spl/u-boot-spl.bin"

UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd]   = "${UBOOT_CONFIG_BASENAME}_bringup_defconfig,sdcard"
UBOOT_CONFIG[xspi] = "${UBOOT_CONFIG_BASENAME}_xspi_defconfig"

# Set ATF platform name
ATF_PLATFORM = "imx943"
OEI_CONFIGS = "ddr"
OEI_CORE = "m33"

IMXBOOT_VARIANTS = "alt"

# Multiple system manager configs by IMXBOOT_VARIANT
SYSTEM_MANAGER_CONFIG = "${@bb.utils.contains('IMXBOOT_VARIANT', 'alt',       'mx94alt', \
                                                                              'mx94evk', d)}"

MSEL_TYPE = "${@bb.utils.contains('IMXBOOT_VARIANT', 'alt',       '1', \
                                                                  '0', d)}"

SYSTEM_MANAGER_FIRMWARE_BASENAME = "m33_image"

IMXBOOT_TARGETS_BASENAME = "flash"

# imx-boot (flash.bin) targets based on UBOOT_CONFIG and IMXBOOT_VARIANT
IMXBOOT_TARGETS_SD = "${@bb.utils.contains('IMXBOOT_VARIANT', 'alt',       '${IMXBOOT_TARGETS_BASENAME}_a55', \
                                                                           '${IMXBOOT_TARGETS_BASENAME}_all ${IMXBOOT_TARGETS_BASENAME}_a55', d)} \
"

IMXBOOT_TARGETS = "${@bb.utils.contains('UBOOT_CONFIG', 'xspi', 'flash_a55_xspi', '${IMXBOOT_TARGETS_SD}', d)}"

IMX_BOOT_SOC_TARGET = "iMX94"
IMX_BOOT_SEEK = "32"

# We have to disable SERIAL_CONSOLE due to auto-serial-console
SERIAL_CONSOLES = "115200;ttyLP0"

IMX_DEFAULT_BSP = "nxp"
