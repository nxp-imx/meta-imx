# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz "

# use clocks on older kernels only - also fix imx-test issue with hdr name change
SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                      file://clocks.sh"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "a3c2f3f1a0acd9fbde57cfa2beef6059"
SRC_URI[sha256sum] = "e7dd9f34a9cbd156c88b99392e80861b5e28a2bfa52f38ec6de9c7cea9c64ab6"

COMPATIBLE_MACHINE = "(mx6|mx5)"

do_install_mx6() {
        install -d ${D}/unit_tests
        install -m 755 test-utils.sh ${D}/unit_tests/test-utils.sh
        install -m 755 ${S}/platform/${PLATFORM}/* ${D}/unit_tests/
}
