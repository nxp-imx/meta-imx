# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"
DEPENDS_append = "dtc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRCBRANCH = "imx_v2017.03"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "8fe8d6d2ede6dc355dffb0e772fc610744313b9e"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"

UBOOT_NAME_mx6 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
UBOOT_NAME_mx7 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
UBOOT_NAME_mx8 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
