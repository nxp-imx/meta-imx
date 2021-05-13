# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[md5sum] = "ba495a9b81052c80373d2476b494feb1"
SRC_URI[sha256sum] = "110ac856557cf57113dff54d25b538c05f79f98f495d2f3ba9d9c15391ac7877"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
