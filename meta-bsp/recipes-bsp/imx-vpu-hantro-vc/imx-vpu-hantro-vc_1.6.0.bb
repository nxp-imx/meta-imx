# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

SRC_URI[md5sum] = "655941816008d54740fc67b71acbdfa6"
SRC_URI[sha256sum] = "6aca69bc5b57046312be5c3345087fa2fb50a6db5bbcd49cb997be44c36ed248"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
