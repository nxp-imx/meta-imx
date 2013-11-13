# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz "

# use clocks on older kernels only - also fix imx-test issue with hdr name change
SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                      file://clocks.sh"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "a1e1d1caa71b10e3caa4328a7ecb4cc2"
SRC_URI[sha256sum] = "8c6f328a685d3a59c0eab9e4ebde8d2cfbb2f676d92d3839a586c23c8ef530ec"

COMPATIBLE_MACHINE = "(mx6|mx5)"

do_install_mx6() {
        install -d ${D}/unit_tests
        install -m 755 test-utils.sh ${D}/unit_tests/test-utils.sh
        install -m 755 ${S}/platform/${PLATFORM}/* ${D}/unit_tests/
}
