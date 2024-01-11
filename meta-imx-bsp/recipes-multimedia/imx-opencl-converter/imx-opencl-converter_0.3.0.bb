# Copyright 2023 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 
DEPENDS = "opencl-headers"
DEPENDS:append:mx95-nxp-bsp = " virtual/opencl-icd"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "def95324f43cbce818643d1190c7cb4e"
SRC_URI[sha256sum] = "a0f7154587a28412f189f14b9ac6066b3ff65cff4585c8095123b637dd9987a2"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
