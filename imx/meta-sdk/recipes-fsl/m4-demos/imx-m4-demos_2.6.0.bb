# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI[imx7ulp.md5sum] = "024d771b301343e3e4ab046c6a0c1760"
SRC_URI[imx7ulp.sha256sum] = "e4efb9646b66df867f618bd8121e14afe17ebadea4a405a4df951d45d841e681"

SRC_URI[imx8mm.md5sum] = "cc9781bca30fed966937ad9e7a57c5d6"
SRC_URI[imx8mm.sha256sum] = "4e41e270506870e0fd2d53e3d69afdcf6d613d099b0da5c516a512944c5c12c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
