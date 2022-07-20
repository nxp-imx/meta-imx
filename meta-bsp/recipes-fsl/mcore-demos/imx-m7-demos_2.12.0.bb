# Copyright 2019-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI[imx8mnddr3l.md5sum] = "5044af3661d81dd7f2afcce33b538a82"
SRC_URI[imx8mnddr3l.sha256sum] = "e1cd2d20ea57dbf53ae780c726582db6007a5b4694f2f5cd2d24a2a651ca2f76"

SRC_URI[imx8mn.md5sum] = "17174ca2744c039be48c96da7780fed8"
SRC_URI[imx8mn.sha256sum] = "6a6db11fdfc2e4832be89b9b62e2b995c4aa7b4e770c9b6eec2aa8ea1f0c5405"

SRC_URI[imx8mp.md5sum] = "7afb64d9ca39cb733180ce28700d0baf"
SRC_URI[imx8mp.sha256sum] = "24d2ffd1dff35a4409fd58cac02e47d53bd0f5f589a59d4fb015d9076881c6c8"

COMPATIBLE_MACHINE = "(mx8mnul-nxp-bsp|mx8mn-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
