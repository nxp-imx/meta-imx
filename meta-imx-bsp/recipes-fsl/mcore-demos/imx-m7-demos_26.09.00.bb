# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx937-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI[imx8mn.sha256sum] = "3852704295f20abbdf2a1b67b42eae56a5389de04165bb890cb904829ec107ee"
SRC_URI[imx8mnddr3l.sha256sum] = "f1e8f418a532087714affb205271612b300867506733b3fe3dd26f2ac4979614"

SRC_URI[imx8mp.sha256sum] = "eda3c77f219c2746d7e7126d7e22b9103c90f824c9ff06a1387a53eb573f1edc"

SRC_URI[imx937.sha256sum] = "b83665926032a91b83171c0014c11856be9971f122db6054643727872dbec8c6"

SRC_URI[imx95.sha256sum] = "8ecb7ca6084a976c491cc1a41ca8f42c533e2f0b9c803442331614f831ec6920"

SRC_URI[imx952.sha256sum] = "46664779249f1a0cb9b425a4efea8bc859a8ea0b47ab6301bccd77faf76eec7c"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx937-generic-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
