# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7d  += "imx-vpu"

SRC_URI[md5sum] = "26e0167585d584a72ce6aa7ea1e6b914"
SRC_URI[sha256sum] = "a089a707bba5505c21a1df9e0908f8a8391c4c5cd455cc2f58e34b4178e01b4d"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
