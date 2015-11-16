# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6373fe6bacd4f2dc9d8b98fce78d527f"
SRC_URI[sha256sum] = "31e0905b4a5c34a58877a812d46b6ae9ebf8154d36f83d513690d1490d5d03e0"

inherit autotools-brokensep

FILES_${PN} += "/linuxrc /fat"
