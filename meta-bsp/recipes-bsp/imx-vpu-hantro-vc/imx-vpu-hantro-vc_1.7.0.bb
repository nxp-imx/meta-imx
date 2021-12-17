# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81"

SRC_URI[md5sum] = "362d73d4e17e64933e08aeb2e0b32657"
SRC_URI[sha256sum] = "0fbd2e1b4464f288fdc2a2ec6d425a5998d67b632959cf19a394074698cbd795"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
