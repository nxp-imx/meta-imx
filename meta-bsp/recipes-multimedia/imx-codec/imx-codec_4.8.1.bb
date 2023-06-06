# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "e4d1e50f2d0829283e2f1aa0cb2e7ba3"
SRC_URI[sha256sum] = "d1802f0bd9b70f20e44a414948dca939ff862d29f0a795e797939afb8531261a"

inherit fsl-eula-unpack
