# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "8a190d2a2387b2651fcb447193fe0807"
SRC_URI[sha256sum] = "31dc2a907a2981eb41b1c9d891dd0980843cf26b537d319d2f5cadec79706a45"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP_${PN} = "already-stripped"

FILES_${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8)"
