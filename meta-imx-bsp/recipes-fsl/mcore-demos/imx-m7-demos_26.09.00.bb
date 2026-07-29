# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx937-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI[imx8mn.sha256sum] = "3852704295f20abbdf2a1b67b42eae56a5389de04165bb890cb904829ec107ee"
SRC_URI[imx8mnddr3l.sha256sum] = "71b4bc2de18a102b8995e68d0c0ccbfe9dc505b57ea3f3ba3c7f492db4adb3a1"

SRC_URI[imx8mp.sha256sum] = "34daac1c9d062836c949995a757297bd342c55a3de5838558e3d9e2ccd75d348"

SRC_URI[imx937.sha256sum] = "2153597fbdf240813266d72135ca58dabe876b3a10e90e99dd359cb50b7e1600"

SRC_URI[imx95.sha256sum] = "86f216b03917c2544832315b23c381b9db464d40a7297854e7c38bee74da4315"

SRC_URI[imx952.sha256sum] = "46664779249f1a0cb9b425a4efea8bc859a8ea0b47ab6301bccd77faf76eec7c"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx937-generic-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
