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

SRC_URI[md5sum] = "6fe87845907624be41653b0868931946"
SRC_URI[sha256sum] = "df79e57f71662ebccddb786feadd7934b784e5ed1d3280420f06a30813e5a2b2"

# Add MX6SX platform option
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
