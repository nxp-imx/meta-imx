# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz "

DEPENDS_mx28   = "virtual/kernel"

# use clocks on older kernels only - also fix imx-test issue with hdr name change
SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                      file://clocks.sh"

SRC_URI_append_mx28 = " file://clocks.sh"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "ce1a173c45057294abe0e4a5ddf39471"
SRC_URI[sha256sum] = "feedebd222e2b7d7857cb9388f5d7f2ab53c3f07a3a763f6a7f1c1c18f7dc41f"

COMPATIBLE_MACHINE = "(mx6|mx5|mx28)"

do_install_mx6() {
        install -d ${D}/unit_tests
        install -m 755 test-utils.sh ${D}/unit_tests/test-utils.sh
        install -m 755 ${S}/platform/${PLATFORM}/* ${D}/unit_tests/
}
