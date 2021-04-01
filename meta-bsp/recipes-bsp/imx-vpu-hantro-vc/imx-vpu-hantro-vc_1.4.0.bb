# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[md5sum] = "0e6e4c789640effa6ff8a97fe5c311ca"
SRC_URI[sha256sum] = "a19369cf338b78548422a1dc0d921010ffe6e666017c2d51ace6efd528642b3b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
