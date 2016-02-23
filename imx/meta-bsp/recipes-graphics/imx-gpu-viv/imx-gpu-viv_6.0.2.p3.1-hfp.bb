# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "b0f782e8af48f34dd9834a7082a8e233"
SRC_URI[sha256sum] = "76ab4c821a32271cd67456305be1681ecfa1d0ba5e054770d067496c3bc19a68"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl)"
