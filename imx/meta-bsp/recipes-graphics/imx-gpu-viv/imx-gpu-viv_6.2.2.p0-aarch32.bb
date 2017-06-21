# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "f8b3b5671c65169120704b03f86bbc95"
SRC_URI[sha256sum] = "4d6763f858c1c087df436885886459706efaf0c589505d1b9e233550370a4e24"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
