# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-common.inc

SRC_URI =+ "${FSL_MIRROR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp.bin;fsl-eula=true"

S="${WORKDIR}/gpu-viv-bin-mx6q-3.10.31-1.1.0-beta-hfp"

SRC_URI[md5sum] = "b5213bdbc077b0b82b6c27619c40c895"
SRC_URI[sha256sum] = "65c8c1c93387bd02df12807f7a47bd06c3e1d5de059bb7dc154fda229eb4beae"

PACKAGE_FP_TYPE = "hardfp"
