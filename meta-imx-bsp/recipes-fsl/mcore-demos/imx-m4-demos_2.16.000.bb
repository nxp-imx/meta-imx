# Copyright 2017-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx7ulp.md5sum] = "4ec757b7a2a2bdf33f583c328a4631f1"
SRC_URI[imx7ulp.sha256sum] = "51715bee5e300ee6160c92979e7075e3aa7f7114e7742699bfaa9779113a6fe9"

SRC_URI[imx8mm.md5sum] = "8db99da9efe8a5409a246c8a63d418dc"
SRC_URI[imx8mm.sha256sum] = "8269d7461efcdba0b8c3e684df8b45c2d8ace3fdf426b81bdfb46855a1577987"

SRC_URI[imx8mq.md5sum] = "0235860aca583e50af88b141e8f25d13"
SRC_URI[imx8mq.sha256sum] = "decb52b246800e3fa926704207a0ac9a960723da8502887a31f353aaa370c9d9"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"
