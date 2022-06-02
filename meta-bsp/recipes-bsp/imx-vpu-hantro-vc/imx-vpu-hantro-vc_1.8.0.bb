# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d0122773a9d62bd492c87ffaf42463b5"

SRC_URI[md5sum] = "228b06302ad0f0da13a160573c06bbf4"
SRC_URI[sha256sum] = "537fdbc20fbd1fb561b9a0d01ad843ea25c46e5a5cd184960fc9f1074674ddce"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
