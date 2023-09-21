# Copyright 2023 NXP

DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "c9b372a5f899b7e259c03192ec90c529"
SRC_URI[sha256sum] = "353f03642d145e16782b117dfcbbf81a832360ec9df179cc06b9033a611898d2"

DEPENDS = "opencl-headers"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp    = "(^$)"
COMPATIBLE_MACHINE:mx8dxl-nxp-bsp    = "(^$)"
