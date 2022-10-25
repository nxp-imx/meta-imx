# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "ef8b76bbe907539e62b5bd30c0c08f75"
SRC_URI[sha256sum] = "90e541b82b6849ec8b00bdf70b89b2af3a36cebde8b9b067341243ea46bc786a"

inherit fsl-eula-unpack
