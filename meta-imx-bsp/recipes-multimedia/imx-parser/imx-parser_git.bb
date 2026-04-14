# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.0+git"

SRCBRANCH = "master"
IMXPARSER_SRC ?= "git://github.com/nxp-imx/imx-parser;protocol=https"
SRC_URI = "${IMXPARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "ec8a9acf4b98f8d5f8a3f4069b1b01b78a36cbd9"

CFLAGS += "-Wno-error=pointer-to-int-cast -Wno-error=int-to-pointer-cast"
