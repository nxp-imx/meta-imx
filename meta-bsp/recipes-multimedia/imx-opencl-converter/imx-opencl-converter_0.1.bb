# Copyright 2023 NXP

DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "dc91bd1567708f5eade3aed4c4e1532c"
SRC_URI[sha256sum] = "745b95a1729241e1f71914060dcd97a19b61512929ef8b81d3601739b6623482"

DEPENDS = "opencl-headers"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp    = "(^$)"
COMPATIBLE_MACHINE:mx8dxl-nxp-bsp    = "(^$)"
