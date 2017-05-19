# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale alsa-lib plugins"
LICENSE = "GPLv2"
SECTION = "multimedia"
DEPENDS = "alsa-lib virtual/kernel"

# For backwards compatibility
PROVIDES += "fsl-alsa-plugins"
RREPLACES_${PN} = "fsl-alsa-plugins"
RPROVIDES_${PN} = "fsl-alsa-plugins"
RCONFLICTS_${PN} = "fsl-alsa-plugins"

# Make sure kernel sources are available
do_configure[depends] += "virtual/kernel:do_shared_workdir"

LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit autotools pkgconfig

IMXALSA_SRC ?= "git://git.freescale.com/imx/fsl-alsa-plugins.git;protocol=git"
FSL_MM_GIT_TAGBRANCH ?= "MM_04.02.01_1705_L4.9.11_CONSOLIDATED_GA"

SRC_URI = "${IMXALSA_SRC};branch=${FSL_MM_GIT_TAGBRANCH}"
SRCREV = "9a63071e7734bd164017f3761b8d1944c017611f"
S = "${WORKDIR}/git"

INCLUDE_DIR = "-I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

EXTRA_OECONF = "CFLAGS="${INCLUDE_DIR}""

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += "${libdir}/alsa-lib/libasound_*.so"
FILES_${PN}-dbg += "${libdir}/alsa-lib/.debug"
FILES_${PN}-dev += "${libdir}/alsa-lib/*.la"

COMPATIBLE_MACHINE = "(mx6dl|mx6q|mx6sl|mx6sx|mx6ul|mx6ull|mx7d)"
PACKAGE_ARCH = "${MACHINE_SOCARCH}"
