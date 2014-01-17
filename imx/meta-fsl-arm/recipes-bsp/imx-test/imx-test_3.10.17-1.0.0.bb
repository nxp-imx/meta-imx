# Copyright (C) 2013, 2014 Freescale Semiconductor

include imx-test.inc

SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"
SRC_URI_append_mxs = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"

SRC_URI[md5sum] = "51168d3d30b8fff84b3552b399362023"
SRC_URI[sha256sum] = "9627d6874d2d5e23710763e2011be8b3a4cbe60356bec166fde5dc26acc5c2d4"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
