# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.1+git"

SRCBRANCH = "MM_04.11.01_2608_L6.18.37"
IMXPARSER_SRC ?= "git://github.com/nxp-imx/imx-parser;protocol=https"
SRC_URI = "${IMXPARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "0b6bb15c689c2ec13d5c76c5dc563adc0c71196f"

