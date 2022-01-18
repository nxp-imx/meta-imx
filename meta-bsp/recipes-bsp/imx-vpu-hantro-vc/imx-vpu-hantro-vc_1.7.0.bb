# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI[md5sum] = "59961c56bac620baaee55cfb1cee323a"
SRC_URI[sha256sum] = "1f92af268ebb6da8cd622f5540d32370c3a98cea85f9ede93833e9e8c26b8888"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
