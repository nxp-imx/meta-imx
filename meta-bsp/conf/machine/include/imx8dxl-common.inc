# Provides the i.MX8DXL EVK common settings

MACHINE_FEATURES_append = " pci bcm43455 bcm4356 bcm4359 nxp8997"

# Don't include kernels in standard images
RDEPENDS_${KERNEL_PACKAGE_NAME}-base = ""
RDEPENDS_${KERNEL_PACKAGE_NAME}-image = ""

LOADADDR = ""

# Disable the serial console due to auto-serial-console
SERIAL_CONSOLES = "115200;ttyLP0"

# we do not want to have getty running on tty1 as we run
# auto-serial-console there
USE_VT = "0"

UBOOT_MAKE_TARGET = "all"
SPL_BINARY = "spl/u-boot-spl.bin"

IMAGE_BOOTLOADER = "imx-boot"
IMX_BOOT_SEEK = "32"

IMXBOOT_TARGETS_SD = \
    "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'flash_linux_m4 flash_linux_m4_no_v2x flash_spl', \
                                                       'flash_regression_linux_m4 flash', d)}"
IMXBOOT_TARGETS_FSPI = \
    "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'flash_spl_flexspi', \
                                                       'flash_flexspi', d)}"
IMXBOOT_TARGETS_NAND = \
    "${@bb.utils.contains('MACHINE_FEATURES', 'optee', 'flash_spl_nand', \
                                                       'flash_nand flash_nand_fw', d)}"
IMXBOOT_TARGETS = \
    "${@bb.utils.contains('UBOOT_CONFIG',        'sd', '${IMXBOOT_TARGETS_SD}',   \
        bb.utils.contains('UBOOT_CONFIG',      'fspi', '${IMXBOOT_TARGETS_FSPI}', \
        bb.utils.contains('UBOOT_CONFIG',      'nand', '${IMXBOOT_TARGETS_NAND}', \
                                                       'UNHANDLED_UBOOT_CONFIG_${UBOOT_CONFIG}', d), d), d)}"
