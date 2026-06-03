# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.0+git"

SRCBRANCH = "MM_04.11.00_2605_L6.18.20"
IMXPARSER_SRC ?= "git://github.com/nxp-imx/imx-parser;protocol=https"
SRC_URI = "${IMXPARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "302063af37c2edfabc9cec96516aefa9ed38bc2e"

CFLAGS += "-Wno-error=pointer-to-int-cast -Wno-error=int-to-pointer-cast"
