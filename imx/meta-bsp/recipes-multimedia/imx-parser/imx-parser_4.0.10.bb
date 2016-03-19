# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-multimedia/imx-parser/imx-parser.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

SRC_URI[md5sum] = "06d5d51c2cfb34ffabdbeb209fd98496  /home/raa013/yocto/pkg-work2/packages/imx-parser-4.0.10.bin"
SRC_URI[sha256sum] = "8946d90920b5723b547c10203a759f49823619682eabe2d720182791aa8f34f8  /home/raa013/yocto/pkg-work2/packages/imx-parser-4.0.10.bin"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|mx6ul|mx7)"
