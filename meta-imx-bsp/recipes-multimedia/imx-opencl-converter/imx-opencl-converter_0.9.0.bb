# Copyright 2023-2024 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
DEPENDS = "virtual/opencl-icd"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "47f3fd3"

SRC_URI[sha256sum] = "bfed4969187943ec9737a27dd32f95b8718e109f5a1d5289e9803c489105677f"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"
inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"
