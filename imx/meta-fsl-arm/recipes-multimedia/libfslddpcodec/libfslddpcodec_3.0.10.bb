# Copyright (C) 2013 Freescale Semiconductor

# Note this codec requires special licensing through Freescale marketing
DESCRIPTION = "This package provides DDPlus decoder library"
SECTION = "multimedia"
LICENSE = "Proprietary"
LICENSE_FLAGS = "commercial"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=93b784b1c11b3fffb1638498a8dde3f6"

DEPENDS = "libfslcodec"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "501bcb2a82f863805ea87c4e263a56d7"
SRC_URI[sha256sum] = "77927732099f6574b5162c7dea13910d7020ae2a49ab1e81383eb1ceec7ff296"

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
INSANE_SKIP_${PN} = "ldflags textrel dev-so"

FILES_${PN} += "${libdir}/*${SOLIBSDEV} ${libdir}/imx-mm/audio-codec/wrap/*${SOLIBS} \
				${libdir}/imx-mm/audio-codec/wrap/*${SOLIBSDEV}"
FILES_${PN}-dev = "${libdir}/pkgconfig/*.pc ${includedir}/imx-mm/*"
# Add examples to -testapps PACKAGE
FILES_${PN}-testapps += "${datadir}/imx-mm/*"

COMPATIBLE_MACHINE = "(mx5|mx6)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
