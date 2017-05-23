# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright NXP

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

PV = "5.5+git${SRCPV}"

SRC_URI = "git://github.com/NXPmicro/imx-kobs.git;protocol=https"

SRCREV = "a2734b93759b4222f9dfa3f8c7645be9d39ea601"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
