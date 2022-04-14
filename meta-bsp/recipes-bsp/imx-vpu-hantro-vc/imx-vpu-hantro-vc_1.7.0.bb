# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"

SRC_URI[md5sum] = "2dbcd9a71d53b86654704932798f263e"
SRC_URI[sha256sum] = "8af665f8e06e0e467f563e372f43583d94128f0d37f75321965bc26bd4404b2b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp)"
