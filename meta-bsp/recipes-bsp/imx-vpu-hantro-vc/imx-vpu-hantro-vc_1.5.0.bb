# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

SRC_URI[md5sum] = "6e8f8a94ca11ae03ecbe5129d41138cc"
SRC_URI[sha256sum] = "56252a17c2311950233f79e45d3c56f41754e3fef704a2e5e04fa26bcc721de4"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
