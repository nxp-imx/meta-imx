# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c6c6eecabdaf2fa93b9e55e719a98f5"
SRC_URI[sha256sum] = "731f3204dcce954287ae738bcfc74fd721f8cf1b2abe159bf2e7906db2c96697"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
