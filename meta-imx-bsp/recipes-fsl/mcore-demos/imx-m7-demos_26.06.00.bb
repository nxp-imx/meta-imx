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

SRC_URI[imx8mp.sha256sum] = "6c1a12c39c0e2255edc348e8e43138793f279a92d990d1f91e17436cd4e812d4"

SRC_URI[imx95.sha256sum] = "7978737ebc19695783d5a60ae865198d79bbafdb97cdbd56d29c9a8eb5ad234e"

SRC_URI[imx952.sha256sum] = "6f7505d44d8ab0e0e9f6cf23f9c54554192c6fef2058c83c77710c56ab0f1ea8"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
