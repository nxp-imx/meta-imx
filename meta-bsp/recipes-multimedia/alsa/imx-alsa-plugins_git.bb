# Copyright 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale alsa-lib plugins"
LICENSE = "GPLv2"
SECTION = "multimedia"
DEPENDS = "alsa-lib"

# For backwards compatibility
PROVIDES += "fsl-alsa-plugins"
RREPLACES_${PN} = "fsl-alsa-plugins"
RPROVIDES_${PN} = "fsl-alsa-plugins"
RCONFLICTS_${PN} = "fsl-alsa-plugins"

LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit autotools pkgconfig use-imx-headers

IMXALSA_SRC ?= "git://github.com/nxp-imx/imx-alsa-plugins.git;protocol=https"
SRCBRANCH = "MM_04.06.02_2108_L5.10.y"

SRC_URI = "${IMXALSA_SRC};branch=${SRCBRANCH}"
SRCREV = "cde60d68ab2acee913dbfacb8aabb53d87dd3e38"
S = "${WORKDIR}/git"

INCLUDE_DIR = "-I${STAGING_INCDIR_IMX}"

EXTRA_OECONF = "CFLAGS="${INCLUDE_DIR}""

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += "${libdir}/alsa-lib/libasound_*.so"
FILES_${PN}-dbg += "${libdir}/alsa-lib/.debug"
FILES_${PN}-dev += "${libdir}/alsa-lib/*.la"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
