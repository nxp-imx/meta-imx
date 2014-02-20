# Copyright (C) 2013-14 Freescale Semiconductor

# Note this codec requires special licensing through Freescale marketing
DESCRIPTION = "This package provides AC3 decoder library"
SECTION = "multimedia"
LICENSE = "Proprietary"
LICENSE_FLAGS = "commercial"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=93b784b1c11b3fffb1638498a8dde3f6"

DEPENDS = "libfslcodec"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "6f925e8f48cac3929cc4e5dd2b3d3a80"
SRC_URI[sha256sum] = "c06c0220e73eaabf9208c121f8ce8e151915d7089a35d7b69207167afa313663"

# Choose between Soft Float-Point and Hard Float-Point
EXTRA_OECONF = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--enable-fhw', '', d)}"

do_install_append() {
    # LTIB move the files around or gst-fsl-plugin won't find them
    mv $p ${D}${libdir}/imx-mm/audio-codec/*.so* ${D}${libdir}

}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
PACKAGES += "${PN}-testapps"

# FIXME: All binaries lack GNU_HASH in elf binary but as we don't have
# the source we cannot fix it. Disable the insane check for now.
INSANE_SKIP_${PN} = "ldflags textrel"
INSANE_SKIP_${PN}-testapps = "ldflags"

FILES_${PN} += "${libdir}/imx-mm/audio-codec/wrap/*${SOLIBS}"
FILES_${PN}-dev += "${libdir}/pkgconfig/*.pc ${includedir}/imx-mm/* \
                    ${libdir}/imx-mm/audio-codec/wrap/*${SOLIBSDEV}"
# Add examples to -testapps PACKAGE
FILES_${PN}-testapps += "${datadir}/imx-mm/*"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
