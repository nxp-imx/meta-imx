# Copyright (C) 2012-2015 Freescale Semiconductor

require recipes-bsp/firmware-imx/firmware-imx.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.14.38-6QP_beta.bin;fsl-eula=true"
S = "${WORKDIR}/${PN}-3.14.28-6QP-beta"

SRC_URI[md5sum] = "ea3fb0adad65775b9c7a688871d92aec"
SRC_URI[sha256sum] = "86b6c54ba1c37b56d89c170043814e3e784db46eb2ca3b3d6b1d8d6faea92a6b"

COMPATIBLE_MACHINE = "(mx5|mx6)"
