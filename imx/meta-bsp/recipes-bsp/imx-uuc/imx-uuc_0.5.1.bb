# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa34c129b9a9287a9e48a8b293bac1a4"
SRC_URI[sha256sum] = "a8a1bf56fe9fe43558cf9f9dc5cf7b8113946a686f91c496990624658d187621"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
