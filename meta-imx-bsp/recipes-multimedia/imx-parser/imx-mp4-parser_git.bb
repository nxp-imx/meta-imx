# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX MP4 multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.0+git"

DEPENDS = "imx-parser"

SRCBRANCH = "MM_04.11.00_2605_L6.18.20"
IMXMP4PARSER_SRC ?= "git://github.com/nxp-imx/imx-mp4-parser.git;protocol=https"
SRC_URI = "${IMXMP4PARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "549385967c668f4f43f4c1b58d15f583fceecbed"

