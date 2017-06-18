# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "5447f9907fd12946c7ca18c4e7846a9d"
SRC_URI[sha256sum] = "d1461ff17da2db329c0394557053ecd82a36509d5687e3d0e651cd0b344da68a"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
