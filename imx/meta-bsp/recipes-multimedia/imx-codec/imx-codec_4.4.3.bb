# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "6087fbac97002b7d8c5dd061e6b36417"
SRC_URI[sha256sum] = "f225968d8efcdb8f1843adae162360df04166e91acea2c32388cf699f410bdda"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
