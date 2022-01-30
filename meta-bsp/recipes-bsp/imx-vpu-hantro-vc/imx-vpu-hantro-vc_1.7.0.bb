# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI[md5sum] = "edcaa9fd632a205d32b110b95c8913ef"
SRC_URI[sha256sum] = "b8e9f178faa3bc171d72242c53e31a20ea21999692b56b6e9e9b0ea5863c848b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
