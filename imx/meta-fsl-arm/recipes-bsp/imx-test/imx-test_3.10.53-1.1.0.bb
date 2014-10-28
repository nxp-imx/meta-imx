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

SRC_URI[md5sum] = "c5abddcc28c90fb09502f994128c9ddc"
SRC_URI[sha256sum] = "b434ad8408c9304c3c501c0899f95c6cc3c69b19130cf8554d2fb6691606ecc5"

# Add MX6SX platform option
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
