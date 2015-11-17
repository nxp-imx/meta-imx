# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e3324de0e228009713d9e413dcf6734"
SRC_URI[sha256sum] = "44c9cc73644bec2a0a52fd70678da309233bf2a94b6630cb8d4b74d4e8915581"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
