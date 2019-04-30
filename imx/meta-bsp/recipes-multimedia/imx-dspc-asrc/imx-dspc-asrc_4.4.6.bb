# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECONF = "--enable-armv8 --libdir=/usr/lib --bindir=/unit_tests"

SRC_URI[md5sum] = "f9983bcc03ff5ca9de2f2fc3ac149031"
SRC_URI[sha256sum] = "e6a13dd33fd3278391b2a2b73224b1413c661c1cf033a61d3d0002e5de1ee906"

FILES_${PN} = " /unit_tests \
                 ${datadir}/imx-mm/audio-codec/asrc \
"

INSANE_SKIP_${PN}-dev = "dev-elf"

COMPATIBLE_MACHINE = "(mx8)"

