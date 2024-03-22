# Copyright 2023 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f" 
DEPENDS = "virtual/opencl-icd"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "0f199c99ac32bf09ecee4688c6467886"
SRC_URI[sha256sum] = "ae046d392e0d770259822deb9096895b680897ce0bb6a3e1c6e0a9542f2dabf3"

inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
