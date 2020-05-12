# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "a0f063c41eeb46b6b916bca2e3f13090"
SRC_URI[sha256sum] = "adeb8ad73938516f1c5277cdcdb415651a601cdbdda9e0bc986af4d8b6e6f2b8"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP_${PN} = "already-stripped"

FILES_${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8)"
