# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mn.sha256sum] = "fd4350c9ceceda29d6f7483f83a946b1876b364a4d9c8d9a9e6b618415d27b8e"
SRC_URI[imx8mnddr3l.sha256sum] = "cdaad7f840eec638568bde934408044a386e56b85d22a20c1de7faf77b0674c7"

SRC_URI[imx8mp.sha256sum] = "53d31afa89d7d9e2e93b327fe5735bcea6f2f6c67860cb0410fe75c5621278fa"

SRC_URI[imx95.sha256sum] = "7b17f04fe67df6272f85d9233d5fb074eff91c2097b44303b5463aab421cb0c0"

SRC_URI[imx952.sha256sum] = "ed6e83df4d85da1c6aec890b3ebb97a916c8663fa109e7b17f4ed74ac44986a2"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
