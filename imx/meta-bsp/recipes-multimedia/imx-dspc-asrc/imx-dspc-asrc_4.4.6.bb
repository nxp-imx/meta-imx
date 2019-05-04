# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECONF = "--enable-armv8 --libdir=/usr/lib --bindir=/unit_tests"

SRC_URI[md5sum] = "a238712653e3344167d08fa62278bba2"
SRC_URI[sha256sum] = "66f5bb59759f4b37ad4832e3fc572e913fef48706ae9005d1cedae8ebc7e559d"

FILES_${PN} = " /unit_tests \
                 ${datadir}/imx-mm/audio-codec/asrc \
"

INSANE_SKIP_${PN}-dev = "dev-elf"

COMPATIBLE_MACHINE = "(mx8)"

