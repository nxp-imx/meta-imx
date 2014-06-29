# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}-beta"

SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"
SRC_URI_append_mxs = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"

SRC_URI[md5sum] = "cdcb4b50426254bb70e5ffaec2a33259"
SRC_URI[sha256sum] = "8d277b863fcc3d3bbd6454991502347a58e42aee010cbecc3b36ea36249ed944"

# Add MX6SX platform option
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
