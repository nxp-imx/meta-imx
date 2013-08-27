# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require libfslcodec.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.9-1.0.0.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-3.10.9-1.0.0"

SRC_URI[md5sum] = "7a2f4f93545cd02950323ce175cd73d9"
SRC_URI[sha256sum] = "4dfc1103f6d8b2c595451a07757ba6f55e03366ec568dcd1dd47de53986c58f9"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
