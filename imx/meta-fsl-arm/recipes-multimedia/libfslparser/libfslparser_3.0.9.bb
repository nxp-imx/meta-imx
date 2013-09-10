# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=93b784b1c11b3fffb1638498a8dde3f6"

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.9-1.0.0.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-3.10.9-1.0.0"

SRC_URI[md5sum] = "655970eb7389860a58cfd3c1e7d3efcf"
SRC_URI[sha256sum] = "bcef8a03d935ac52d2cba8b9aec664906d63cea31d37c05b0bad11dd38fbefca"

# Choose between Soft Float-Point and Hard Float-Point
EXTRA_OECONF = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--enable-fhw', '--enable-fsw', d)}"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
