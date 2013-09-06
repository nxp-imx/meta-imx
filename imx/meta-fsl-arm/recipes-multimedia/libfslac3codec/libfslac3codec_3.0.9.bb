# Copyright (C) 2013 Freescale Semiconductor

# Note this codec requires special licensing through Freescale marketing
DESCRIPTION = "This package provides AC3 decoder library"
SECTION = "multimedia"
LICENSE = "Proprietary"
LICENSE_FLAGS = "license_${PN}-${PV}"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=93b784b1c11b3fffb1638498a8dde3f6"

DEPENDS = "libfslcodec"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.9-1.0.0.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-3.10.9-1.0.0"

SRC_URI[md5sum] = "01c2295147d277fb0440eceab0005963"
SRC_URI[sha256sum] = "4dc41d0023f094c8738b82b8ce62d17f1345c090d820aed54a98c0f11e1db748"

# Choose between Soft Float-Point and Hard Float-Point
EXTRA_OECONF = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--enable-fhw', '', d)}"

do_install_append() {
    # LTIB move the files around or gst-fsl-plugin won't find them
    mv $p ${D}${libdir}/imx-mm/audio-codec/*.so* ${D}${libdir}

}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# FIXME: All binaries lack GNU_HASH in elf binary but as we don't have
# the source we cannot fix it. Disable the insane check for now.
INSANE_SKIP_${PN} = "ldflags textrel dev-so"

FILES_${PN} += "${libdir}/*${SOLIBSDEV} ${libdir}/imx-mm/audio-codec/wrap/*${SOLIBS} \
				${libdir}/imx-mm/audio-codec/wrap/*${SOLIBSDEV} ${datadir}/imx-mm/*"
FILES_${PN}-dev = "${libdir}/pkgconfig/*.pc ${includedir}/imx-mm/*"
FILES_${PN}-dbg += "${libdir}/imx-mm/audio-codec/wrap/.debug"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
