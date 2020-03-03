# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "89465cb7d118e23b0587db1b3b0c046f"
SRC_URI[sha256sum] = "ade248ff8347e5cf7800d6c2f6134f67ce1ba1f70e3e30cf199543897cbce99b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
