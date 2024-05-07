# Copyright 2019-2023 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI[md5sum] = "2a84d8bdb8808cc74dd198cdf7e0e707"
SRC_URI[sha256sum] = "a129aefde5a3afe566fd36b398c59087cfb4cc50d06cfc5b3da10aa055f9b9c7"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
