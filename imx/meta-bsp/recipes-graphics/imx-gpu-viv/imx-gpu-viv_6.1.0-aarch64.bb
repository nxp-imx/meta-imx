# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "5d09b342dd83feb5954bd49c9717cca6"
SRC_URI[sha256sum] = "ece2863bd097d8c678eadc1d9cdfa25ca70e253a84db628cc170ddf5e4bf40ea"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
