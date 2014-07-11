# Copyright (C) 2013, 2014 Freescale Semiconductor

DESCRIPTION = "Bootloader for i.MX platforms"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2014.04_3.10.31_1.1.0_beta"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
SRCREV = "06735bf6724f2dad2dcbbfc188c6a17145c7126b"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
