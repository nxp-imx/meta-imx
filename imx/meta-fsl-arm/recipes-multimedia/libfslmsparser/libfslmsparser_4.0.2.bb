# Copyright (C) 2013, 2014 Freescale Semiconductor

# This parser requires special licensing with Freescale marketing
DESCRIPTION = "Microsoft ASF parser library"
SECTION = "multimedia"
LICENSE_FLAGS = "commercial"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=93b784b1c11b3fffb1638498a8dde3f6"

DEPENDS = "libfslparser"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "99b2f9bbe759e9e1c430ba3b361a8c49"
SRC_URI[sha256sum] = "8174c1a3bf6563a7909c807c4284025973e691472a313eca3ea62a02e8c782db"

# Choose between Soft Float-Point and Hard Float-Point
EXTRA_OECONF = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--enable-fhw', '--enable-fsw', d)}"

# FIXME: All binaries lack GNU_HASH in elf binary but as we don't have
# the source we cannot fix it. Disable the insane check for now.
INSANE_SKIP_${PN} = "ldflags textrel already-stripped"
INSANE_SKIP_${PN}-dev = "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# FIXME: gst-fsl-plugin looks for the .so files so we need to deploy those
FILES_${PN} += "${libdir}/imx-mm/*/*${SOLIBS}"
FILES_${PN}-dev += " ${libdir}/imx-mm/*/*${SOLIBSDEV}"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
