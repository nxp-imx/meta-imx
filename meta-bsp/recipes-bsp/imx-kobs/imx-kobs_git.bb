# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

PV = "5.5+git${SRCPV}"

SRC_URI = "git://github.com/nxpmicro/imx-kobs.git;protocol=https"

SRCREV = "cee66d0e956a64d03cc866fa8819da5b798c7f1b"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
