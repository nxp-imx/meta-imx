# Copyright 2026 NXP Semiconductors

include imx-parser.inc

DESCRIPTION = "i.MX MP4 multimedia parser libraries"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6f862c6751ebcaa393467694c7b0c69a"

PV = "4.11.1+git"

DEPENDS = "imx-parser"

SRCBRANCH = "master"
IMXMP4PARSER_SRC ?= "git://github.com/nxp-imx/imx-mp4-parser.git;protocol=https"
SRC_URI = "${IMXMP4PARSER_SRC};branch=${SRCBRANCH}"
SRCREV = "5681d6722a56a3cb69e4c892372cca3cae668614"

CFLAGS += "-Wno-error=sign-compare"
