# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mn.sha256sum] = "718ea45e75278a97492b8c7e37b2de59c03ea0f1e1753c462b1f0a680bed6044"
SRC_URI[imx8mnddr3l.sha256sum] = "4beb7226696b7bc8012f5d11540d877104d8d5293ff4d24939eeb9e5186b75fb"

SRC_URI[imx8mp.sha256sum] = "53d31afa89d7d9e2e93b327fe5735bcea6f2f6c67860cb0410fe75c5621278fa"

SRC_URI[imx95.sha256sum] = "7b17f04fe67df6272f85d9233d5fb074eff91c2097b44303b5463aab421cb0c0"

SRC_URI[imx952.sha256sum] = "fbf9bc4992ed655a3bb0ad761c39f7f5d47cf9dd1af5c3c6110b2ec252d3a755"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
