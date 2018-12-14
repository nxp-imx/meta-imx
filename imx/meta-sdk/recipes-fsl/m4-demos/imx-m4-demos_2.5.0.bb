# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6dfb32a488e5fd6bae52fbf6c7ebb086"

SRC_URI[imx7ulp.md5sum] = "bcc2dd48a28294b6dea42cbb2ad84ac5"
SRC_URI[imx7ulp.sha256sum] = "2958a3710bcbaa86be7e8cfa87f3db681cb5a3ddb24efb486bfe81dd105c99be"

SRC_URI[imx8mm.md5sum] = "cc9781bca30fed966937ad9e7a57c5d6"
SRC_URI[imx8mm.sha256sum] = "4e41e270506870e0fd2d53e3d69afdcf6d613d099b0da5c516a512944c5c12c3"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm)"
