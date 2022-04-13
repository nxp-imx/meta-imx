# Copyright 2019-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5" 

SRC_URI[imx8mnddr3l.md5sum] = "79ba32fc2f222d9efedd7e1fab414017"
SRC_URI[imx8mnddr3l.sha256sum] = "9a5e8268dfc350e8ef744d53db8089c293667573200c30fc0f345fb4e0935e2a"

SRC_URI[imx8mn.md5sum] = "0907e8f880e19c78795892c2fa22a6c4"
SRC_URI[imx8mn.sha256sum] = "0e0de9e1398a60e06f4ecd016d284d582201df078bfae425a1fbb3897f7660e6"

SRC_URI[imx8mp.md5sum] = "fa321e0bd9f8bd18a694a1a2461a00bc"
SRC_URI[imx8mp.sha256sum] = "d94e8a1a957d7a646d8c897e6e472758704fb4354cd213801e57330379f695fa"

COMPATIBLE_MACHINE = "(mx8mnul-nxp-bsp|mx8mn-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
