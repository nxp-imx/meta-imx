# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"

SRC_URI[imx8mm.md5sum] = "28c188d672848d4bf38ca0828aa3405d"
SRC_URI[imx8mm.sha256sum] = "ed924d6fe00754f01080dedb9eaeeb7e3cf377376567e30c4b0502e2e8f5240d"

SRC_URI[imx8mq.md5sum] = "22381ea606c99b59319d38038f2b311d"
SRC_URI[imx8mq.sha256sum] = "d41c9bda0497f8a0e9405d4c90e32bb7a5f6d465dcd1625b64faabc7cf103e17"

SRC_URI[imx7ulp.md5sum] = "d10d3c49377c1be22157203a97b240af"
SRC_URI[imx7ulp.sha256sum] = "31a023f6d0e6607c64184edeaba09f2a05b4af460e92caa4d321abc0a5a89233"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
