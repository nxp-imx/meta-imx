# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx28   = "virtual/kernel"

# use clocks on older kernels only - also fix imx-test issue with hdr name change
SRC_URI_append_mx5 = "  file://clocks.sh "
SRC_URI_append_mx28 = " file://clocks.sh "

PE = "1"

SRC_URI[md5sum] = "51168d3d30b8fff84b3552b399362023"
SRC_URI[sha256sum] = "9627d6874d2d5e23710763e2011be8b3a4cbe60356bec166fde5dc26acc5c2d4"

COMPATIBLE_MACHINE = "(mx6|mx5|mx28)"

do_install_mx6() {
        install -d ${D}/unit_tests
        install -m 755 test-utils.sh ${D}/unit_tests/test-utils.sh
        install -m 755 ${S}/platform/${PLATFORM}/* ${D}/unit_tests/
}
