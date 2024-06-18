# Copyright 2019-2023 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[md5sum] = "42a7fca6f7fe4cbb0a78e73574050108"
SRC_URI[sha256sum] = "4da38187183ff46f0b50295f4dc43187007d9a56bc93dc7729c9704a702b41a7"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
