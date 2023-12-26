# Copyright 2023 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 
DEPENDS = "opencl-headers"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "6878c9cf669d6d3b2233c4c54b07e101"
SRC_URI[sha256sum] = "28442b180b69a5b4f6aca7d8a71923a1ab52aed64e686e0bb9ff77f18379cf79"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
