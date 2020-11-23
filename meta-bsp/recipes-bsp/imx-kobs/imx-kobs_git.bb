# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

PV = "5.5+git${SRCPV}"

SRC_URI = "git://github.com/nxpmicro/imx-kobs.git;protocol=https"

SRCREV = "269fdffcf97238684de9f28977a73677282e061f"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
