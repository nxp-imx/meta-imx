# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "165e37d52392fdd8ed19d8ecad57995c"
SRC_URI[sha256sum] = "5aa68f774e3655854bbea2594666dbab134e0940ab80c6a0cf309467025df254"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
