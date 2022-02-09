# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI[md5sum] = "2dbcd9a71d53b86654704932798f263e"
SRC_URI[sha256sum] = "8af665f8e06e0e467f563e372f43583d94128f0d37f75321965bc26bd4404b2b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
