# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[md5sum] = "03420c4785d48ec02134fda6074a1548"
SRC_URI[sha256sum] = "78a1fe03355a17d84a4622874cd8e324cc36d83a86b88b7a64c7d7a7dc767094"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
