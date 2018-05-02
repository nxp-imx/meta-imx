# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

DESCRIPTION = "i.MX System Controller Firmware"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"
SECTION = "BSP"

inherit fsl-eula-unpack pkgconfig deploy

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "ddbea44d05fe74e95b3b713da520c225"
SRC_URI[sha256sum] = "7f49af606e94ba40a69b94aa2afc27c778dafe54a897b8a764fbe93d2386c732"

S = "${WORKDIR}/${PN}-${PV}"

BOARD_TYPE ?= "mek"
SC_FIRMWARE_NAME ?= "mx8qm-mek-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8qm = "mx8qm-${BOARD_TYPE}-scfw-tcm.bin"
SC_FIRMWARE_NAME_mx8qxp = "mx8qx-${BOARD_TYPE}-scfw-tcm.bin"
symlink_name = "scfw_tcm.bin"

SYSROOT_DIRS += "/boot"

do_install () {
    install -d ${D}/boot
    install -m 0644 ${S}/${SC_FIRMWARE_NAME} ${D}/boot/
}

BOOT_TOOLS = "imx-boot-tools"

do_deploy () {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/${SC_FIRMWARE_NAME} ${DEPLOYDIR}/${BOOT_TOOLS}/
    cd ${DEPLOYDIR}/${BOOT_TOOLS}/
    rm -f ${symlink_name}
    ln -sf ${SC_FIRMWARE_NAME} ${symlink_name}
    cd -
}

addtask deploy after do_install

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} = "/boot"

COMPATIBLE_MACHINE = "(mx8qm|mx8qxp)"
