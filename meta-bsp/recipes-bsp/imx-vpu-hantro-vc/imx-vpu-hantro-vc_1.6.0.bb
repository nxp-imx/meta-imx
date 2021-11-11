# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[md5sum] = "c24e2622c522bb4bc2da710c27389ee4"
SRC_URI[sha256sum] = "338eaa313cfa6f93eee5930903386fca922f82fda3617ecb2597cc90ccf8f22d"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
