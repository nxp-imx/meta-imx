# Copyright 2017 NXP

DESCRIPTION = "i.MX ARM Trusted Firmware"
SECTION = "BSP"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

inherit fsl-eula-unpack pkgconfig deploy

SRC_URI = "${MX8_DOWNLOADS}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "e2bfd0647cc3a59e6bd7c6d07594e9df"
SRC_URI[sha256sum] = "052b95f6ae44c58f9913f1ddb8fbd38e11bc8fc118a3ce638c4b082f5a1c80c1"

S = "${WORKDIR}/${PN}-${PV}"

BOOT_TOOLS = "imx-boot-tools"

SOC_ATF ?= "imx8qm"
SOC_ATF_mx8qm = "imx8qm"
SOC_ATF_mx8qxp = "imx8qxp"
SOC_ATF_mx8mq = "imx8mq"

SYSROOT_DIRS += "/boot"

do_install () {
    install -d ${D}/boot
    install -m 0644 ${S}/bl31-${SOC_ATF}.bin ${D}/boot/bl31-${SOC_ATF}.bin
}

do_deploy () {
    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
    install -m 0644 ${S}/bl31-${SOC_ATF}.bin ${DEPLOYDIR}/${BOOT_TOOLS}/bl31-${SOC_ATF}.bin
}

addtask deploy before do_install after do_compile

FILES_${PN} = "/boot"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx8)"
