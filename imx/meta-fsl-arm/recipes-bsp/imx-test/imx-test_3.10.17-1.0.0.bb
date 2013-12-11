# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-test/imx-test.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_beta.tar.gz "

DEPENDS_mx28   = "virtual/kernel"

# use clocks on older kernels only - also fix imx-test issue with hdr name change
SRC_URI_append_mx5 = " file://revert_epdc_hdr_change.patch \
                      file://clocks.sh"

SRC_URI_append_mx28 = " file://clocks.sh"

S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "147d31783efe31e558e1054debb41054"
SRC_URI[sha256sum] = "6d9301e8df379cfee9caf224622c4428da8514fe060727c212754792832fa129"

COMPATIBLE_MACHINE = "(mx6|mx5|mx28)"

do_install_mx6() {
        install -d ${D}/unit_tests
        install -m 755 test-utils.sh ${D}/unit_tests/test-utils.sh
        install -m 755 ${S}/platform/${PLATFORM}/* ${D}/unit_tests/
}
