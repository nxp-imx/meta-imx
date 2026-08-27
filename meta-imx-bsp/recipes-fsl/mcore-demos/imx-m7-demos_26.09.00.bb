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

SRC_URI[imx8mn.sha256sum] = "d51f76ef7f3f47e35ed5103ee82d55811c57f9193f9b6228ea3d36bc06b48aea"
SRC_URI[imx8mnddr3l.sha256sum] = "2c67e185a54b3194a0f027b701f9b084eb484c34ef05618c30b6632d886cbcc6"

SRC_URI[imx8mp.sha256sum] = "7407399482b0cb316689820d04e1769469f4b8aa623a303319cb076f0c697f00"

SRC_URI[imx937.sha256sum] = "2153597fbdf240813266d72135ca58dabe876b3a10e90e99dd359cb50b7e1600"

SRC_URI[imx95.sha256sum] = "86f216b03917c2544832315b23c381b9db464d40a7297854e7c38bee74da4315"

SRC_URI[imx952.sha256sum] = "5e0a58afba558a461ee88c1ec6aac94db9c012b50b2487fd4dce69d87753bf73"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx937-generic-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
