# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "A Daemon wait for NXP mfgtools host's command"
SECTION = "base"
DEPENDS = "virtual/kernel dosfstools-native"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools-brokensep

PR = "r1"
PV = "0.5.1+git${SRCPV}"

SRC_URI = "git://github.com/codeauroraforum/imx-uuc.git;protocol=https"
SRCREV = "e2349be2ce985eef3ba433c8eaf1671012dfa54d"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} = "ldflags"

FILES_${PN} += "/linuxrc /fat"
