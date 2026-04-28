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
SRC_URI[imx8mnddr3l.sha256sum] = "eb7f479bf69cfa73bc59ba4289b25bcb01cafeb379839dec7797de8830137586"

SRC_URI[imx8mp.sha256sum] = "2ead4fa253e61dab3af84407ff7e60f66f6ea5b33b1c5eee9d83fc757263ba00"

SRC_URI[imx95.sha256sum] = "52e08e920f18f951d395424aa63df8d5f5ea585d47f1d8bdfb9656c1ef06eb91"

SRC_URI[imx952.sha256sum] = "e717f3a673ef76ba433d192e01c40e2c4ebf7d9487b23e2e505bd07383d797ca"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
