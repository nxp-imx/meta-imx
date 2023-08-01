# Copyright 2017-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8mm.md5sum] = "788192fd5e42d0eab95a27a3738b8615"
SRC_URI[imx8mm.sha256sum] = "178150e9720b84838f26cfcf14d25be247bd9e55e39bfb8238e47aee2d0f6244"

SRC_URI[imx8mq.md5sum] = "2860266c99a4535c2bd14adb7ceaf6ba"
SRC_URI[imx8mq.sha256sum] = "cc13003b637d6912780dc70f37c78b60403a080c6edbb0bf3c7f9bf5a2f98971"

SRC_URI[imx7ulp.md5sum] = "4ec757b7a2a2bdf33f583c328a4631f1"
SRC_URI[imx7ulp.sha256sum] = "51715bee5e300ee6160c92979e7075e3aa7f7114e7742699bfaa9779113a6fe9"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
