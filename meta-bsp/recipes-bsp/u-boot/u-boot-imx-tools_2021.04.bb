require recipes-bsp/u-boot/u-boot-tools.inc
require recipes-bsp/u-boot/u-boot-imx-common_${PV}.inc

PROVIDES:append:class-target = " ${MLPREFIX}u-boot-tools"
PROVIDES:append:class-native = " u-boot-tools-native"
PROVIDES:append:class-nativesdk = " nativesdk-u-boot-tools"

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Set recipe as incompatible by default
COMPATIBLE_MACHINE = "(^$)"

# Whitelist its use for i.MX based machines
COMPATIBLE_MACHINE_use-mainline-bsp = "(.)"
COMPATIBLE_MACHINE_use-nxp-bsp = "(.)"
