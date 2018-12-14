# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[imx7ulp.md5sum] = "0c98453649909bd5427412ac8838cd2a"
SRC_URI[imx7ulp.sha256sum] = "648b4d61919d6b1306f4ff7dab529331908b71c9ac5bff663e5c6c0194643c94"

SRC_URI[imx8mm.md5sum] = "cc9781bca30fed966937ad9e7a57c5d6"
SRC_URI[imx8mm.sha256sum] = "4e41e270506870e0fd2d53e3d69afdcf6d613d099b0da5c516a512944c5c12c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
