# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "ce15d6bcdf77298604c777214a586e31"
SRC_URI[sha256sum] = "db0fc589a4e87eca94129665f039a527c2b52aa3a92261ff43dee6bff5c43106"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --libdir=${libdir} --bindir=/unit_tests"

FILES_${PN} += " /unit_tests \
                 ${libdir} \
                 ${datadir}/imx-mm \
"

INSANE_SKIP_${PN} = "already-stripped"

COMPATIBLE_MACHINE = "(mx8)"
