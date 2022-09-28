# Copyright 2017-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=37cb2d8c2bcf8bf2fbe0366d5d928c29"
LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8mm.md5sum] = "c2261058127d67605910b048585d6b67"
SRC_URI[imx8mm.sha256sum] = "0150edef613130b8c09644356087185a370e4148bc6974eac47b8b01b2735b72"

SRC_URI[imx8mq.md5sum] = "22381ea606c99b59319d38038f2b311d"
SRC_URI[imx8mq.sha256sum] = "d41c9bda0497f8a0e9405d4c90e32bb7a5f6d465dcd1625b64faabc7cf103e17"

SRC_URI[imx7ulp.md5sum] = "501d223d55787eecebb2438e20c0ca1e"
SRC_URI[imx7ulp.sha256sum] = "69b576541f3815a9b5bc19ba188da6e1764e6244cad178282f13ff27da1e4c59"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
