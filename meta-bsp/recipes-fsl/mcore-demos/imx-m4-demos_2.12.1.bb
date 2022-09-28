# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"
LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI[imx8mm.md5sum] = "1231ffebbaae99b59128c5dc05c83339"
SRC_URI[imx8mm.sha256sum] = "94229641dc5dfb118ffa6b535a1c7a51a253ea17924d2ab6113f5df8efde29d5"

SRC_URI[imx8mq.md5sum] = "22381ea606c99b59319d38038f2b311d"
SRC_URI[imx8mq.sha256sum] = "d41c9bda0497f8a0e9405d4c90e32bb7a5f6d465dcd1625b64faabc7cf103e17"

SRC_URI[imx7ulp.md5sum] = "d10d3c49377c1be22157203a97b240af"
SRC_URI[imx7ulp.sha256sum] = "31a023f6d0e6607c64184edeaba09f2a05b4af460e92caa4d321abc0a5a89233"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
