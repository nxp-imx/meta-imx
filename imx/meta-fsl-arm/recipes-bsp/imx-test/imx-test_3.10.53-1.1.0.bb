# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sx = "virtual/kernel imx-lib"

SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"
SRC_URI_append_mxs = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"

SRC_URI[md5sum] = "c5617aaf3ea37c135315abbc555f401e"
SRC_URI[sha256sum] = "dffca057210156e30a0979e76574ebcaf736c51ce7bec8a7b08f501d58a79cef"

# Add MX6SX platform option
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
