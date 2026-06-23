# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx937-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mn.sha256sum] = "e4c343231661ea200c9e03508526335be41b6757066b7d8748f1c18b0eb21763"
SRC_URI[imx8mnddr3l.sha256sum] = "f1e8f418a532087714affb205271612b300867506733b3fe3dd26f2ac4979614"

SRC_URI[imx8mp.sha256sum] = "eda3c77f219c2746d7e7126d7e22b9103c90f824c9ff06a1387a53eb573f1edc"

SRC_URI[imx937.sha256sum] = "1de744428d225ec256a7f95e6339b213ca05841d361c33b92c421d979d332648"

SRC_URI[imx95.sha256sum] = "6894b63683a69be1f97e30c4ecce453c0aeaeb12e9078f83fb77a24334592c79"

SRC_URI[imx952.sha256sum] = "53e88afdea5b14f52ef6c69ffd6b2590c603554e239f691b701363ed8c09507a"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx937-generic-bsp|mx95-nxp-bsp|mx952-nxp-bsp)"
