# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

PROVIDES = "virtual/imxswpdm"
RPROVIDES_${PN} = "virtual/imxswpdm"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "942db36018c6c24214e71606cd40400f"
SRC_URI[sha256sum] = "1b59f2706468d0b501a75fa22365baed2d8f86ac6fe5a7d1c8df0cc76cb5d7a7"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP_${PN} = "already-stripped"

FILES_${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8)"
