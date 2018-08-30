# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

SUMMARY = "A Daemon wait for NXP mfgtools host's command"
SECTION = "base"
DEPENDS = "virtual/kernel dosfstools-native"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools-brokensep

PR = "r1"
PV = "0.5.1+git${SRCPV}"

SRC_URI = "git://github.com/nxpmicro/imx-uuc.git;protocol=https"
SRCREV = "e05cc551fb40efc05cea3c3baf25b480519ec4cd"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} = "ldflags"

FILES_${PN} += "/linuxrc /fat"
