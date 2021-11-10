# Copyright 2018-2021 NXP

DESCRIPTION = "i.MX DSP Codec Wrapper and Lib owned by NXP"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

inherit fsl-eula-unpack autotools pkgconfig

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

SRC_URI[md5sum] = "36e05848c474ed77a949b91cf076136c"
SRC_URI[sha256sum] = "446e2ad8ed4215e4374dcdd63d2898439f4e681c4f7ed8ac3a10c002dd3b2f67"

# Fix strip command failed: 'Unable to recognise the format of the input file'
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INSANE_SKIP_${PN} = "arch dev-so"

FILES_${PN} += "${libdir}/imx-mm/audio-codec ${datadir}/imx-mm"
COMPATIBLE_MACHINE = "(mx8qm|mx8qxp|mx8mp|mx8ulp)"
