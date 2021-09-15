# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

SRC_URI[md5sum] = "67b3e1df62157e7c8f2dc194d8583c88"
SRC_URI[sha256sum] = "83414cdb83fff9008f9ee64729b9d04b8674444fbd9a6c487163f0d5bc7c81ae"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
