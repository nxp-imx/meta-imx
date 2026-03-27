# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.0+git"

SRCBRANCH = "master"
IMXPARSER_SRC ?= "git://github.com/nxp-imx/imx-parser;protocol=https"
SRC_URI = "${IMXPARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "1845d88dd60dc41da54cad72558a0b73b8c61720"
