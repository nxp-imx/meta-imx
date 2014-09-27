# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sx = "virtual/kernel imx-lib"

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
S="${WORKDIR}/${PN}-${PV}"

SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"
SRC_URI_append_mxs = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"

SRC_URI[md5sum] = "0edadfcb37d8d46f37d2e052b0419127"
SRC_URI[sha256sum] = "a003eef5d41037c3adc6bb695cd3f99f62cd780253c212c8071a77c7bba33911"

# Add MX6SX platform option
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
