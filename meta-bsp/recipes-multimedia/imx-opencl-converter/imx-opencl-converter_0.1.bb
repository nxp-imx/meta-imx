# Copyright 2023 NXP

DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de" 

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "ce1c8140a01ad693f74ec558805dc2e9"
SRC_URI[sha256sum] = "a58a922987b0478ff4697e7ad809771737b216232be16596088577e5ee7ebc23"

DEPENDS = "opencl-headers"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"
COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp    = "(^$)"
COMPATIBLE_MACHINE:mx8dxl-nxp-bsp    = "(^$)"
