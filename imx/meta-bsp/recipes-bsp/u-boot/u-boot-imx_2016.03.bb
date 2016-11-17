# Copyright (C) 2013-2016 Freescale Semiconductor

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2016.03"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "6a3c3cde3f799227dfc6221f526d8f9233729ed6"

SRCBRANCH_mx7ulp = "imx_v2016.03_imx7ulp"
UBOOT_SRC_mx7ulp = "git://sw-stash.freescale.net/scm/imx/uboot-imx-testbuild.git;protocol=http"
SRC_URI_mx7ulp = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV_mx7ulp = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
