# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

# FIXME: Drop 'alpha' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.tar.gz"
S="${WORKDIR}/${PN}-${PV}_alpha"

SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"
SRC_URI_append_mxs = " file://revert_epdc_hdr_change.patch \
                       file://clocks.sh"

SRC_URI[md5sum] = "350a84f8c122ce36e65bfc2a87980097"
SRC_URI[sha256sum] = "ae4ada5921ed3b6910589ae530a040e14883f1dbb39ce988c94b797f070c8ddf"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
