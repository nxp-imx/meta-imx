# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[md5sum] = "2af159322f2ce4de142c790ef1946703"
SRC_URI[sha256sum] = "6cee27322d71b801de151ed8c07085950768f5891588de15d4a5a1948bf0cc05"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
