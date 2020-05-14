# Copyright 2020 NXP Semiconductors

DESCRIPTION = "NXP PDM to PCM Software Decimation SIMD Library"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "5184132a68e0d0d6a4aea6aac738f97a"
SRC_URI[sha256sum] = "121b807876683eca81fd561f94487af23e28a7f276bf7299105b9f21e427f623"

inherit fsl-eula-unpack autotools pkgconfig

INSANE_SKIP_${PN} = "already-stripped"

FILES_${PN} += "${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8)"
