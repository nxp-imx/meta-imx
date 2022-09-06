# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI[md5sum] = "192b354d1c21836dc7338606e60b45ae"
SRC_URI[sha256sum] = "62b5ba3c4aab21d0d4be3eee9b204a9bb50b83b6140ee1a3b27c648809bdfbaa"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
