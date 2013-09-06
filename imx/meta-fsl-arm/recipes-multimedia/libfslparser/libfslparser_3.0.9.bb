# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/libfslparser/libfslparser.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=93b784b1c11b3fffb1638498a8dde3f6"

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.9-1.0.0.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-3.10.9-1.0.0"

SRC_URI[md5sum] = "0d51c1df1b6de7c65de06084720a55b7"
SRC_URI[sha256sum] = "1b2279d886306d71012779c5d4931f4ccbc3115da90be924302d6b28ee42afc5"

# Choose between Soft Float-Point and Hard Float-Point
EXTRA_OECONF = "${@bb.utils.contains('TUNE_FEATURES', 'callconvention-hard', '--enable-fhw', '--enable-fsw', d)}"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
