# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8b9a3c4abe6c1e373d46620e7624eae"
SRC_URI[sha256sum] = "936ef53f2292875c752cd7e972144734df635c713b731d4839b3f86c6f9533f1"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
