# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "e76940c531d986e0e998b2988e2cf65c"
SRC_URI[sha256sum] = "ecf494792801ac330a15a845364bce5f50c1825a550deab14007c2a131ddea98"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --libdir=${libdir} --bindir=/unit_tests"

FILES_${PN} += " /unit_tests \
                 ${libdir} \
                 ${datadir}/imx-mm \
"

INSANE_SKIP_${PN} = "already-stripped"

COMPATIBLE_MACHINE = "(mx8)"
