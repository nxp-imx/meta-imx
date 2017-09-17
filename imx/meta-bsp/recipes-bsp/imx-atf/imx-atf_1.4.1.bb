# Copyright 2017 NXP

DESCRIPTION = "i.MX ARM Trusted Firmware"
SECTION = "BSP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

inherit fsl-eula-unpack pkgconfig deploy

SRC_URI = "${MX8_DOWNLOADS}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "438137e9c43e9f2a1f3f63910f21e1b2"
SRC_URI[sha256sum] = "28ed44ed31a90562253ad0c8892475724d55578638e8d711e4b03cd64e0e168d"

S = "${WORKDIR}/${PN}-${PV}"

BOOT_TOOLS = "imx-boot-tools"

SOC_ATF ?= "imx8qm"
SOC_ATF_mx8qm = "imx8qm"
SOC_ATF_mx8qxp = "imx8qxp"
SOC_ATF_mx8mq = "imx8mq"

SYSROOT_DIRS += "/boot"

do_compile () {
    export CROSS_COMPILE="${TARGET_PREFIX}"
    cd ${S}
    # Clear LDFLAGS to avoid the option -Wl recognize issue
    unset LDFLAGS

    echo "-> Build ${SOC_ATF} bl31.bin"
    oe_runmake clean PLAT=${SOC_ATF}
    oe_runmake PLAT=${SOC_ATF} bl31

    unset CROSS_COMPILE
}

do_install () {
    install -d ${D}/boot
    install -m 0644 ${S}/build/${SOC_ATF}/release/bl31.bin ${D}/boot/bl31-${SOC_ATF}.bin
}

do_deploy () {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/build/${SOC_ATF}/release/bl31.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${SOC_ATF}.bin
}

addtask deploy before do_install after do_compile

FILES_${PN} = "/boot"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8)"
