require recipes-bsp/u-boot/u-boot-tools.inc
require recipes-bsp/u-boot/u-boot-imx-common_${PV}.inc

PROVIDES:append:class-target = " ${MLPREFIX}u-boot-tools"
PROVIDES:append:class-native = " u-boot-tools-native"
PROVIDES:append:class-nativesdk = " nativesdk-u-boot-tools"

do_install:append () {
        # mkefivcapsule
        install -m 0755 tools/mkeficapsule ${D}${bindir}/uboot-mkeficapsule
        ln -sf uboot-mkeficapsule ${D}${bindir}/mkeficapsule
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE:class-target = "(imx-generic-bsp)"
