# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[imx7ulp.md5sum] = "f3d312d2a12d76cc353e23ee08ba1c1c"
SRC_URI[imx7ulp.sha256sum] = "43f2de5db02bcb406160886e04d083e7a9253f688fe7b3be75bc9c9e13d425cc"

SRC_URI[imx8mm.md5sum] = "3ece10e2ca255e6964b405f17c9f6342"
SRC_URI[imx8mm.sha256sum] = "c14f6d2f41d2a16eb9f948c6182ef3fbb9dfccdd5399b78e2fe3fa8ae9006dde"

SRC_URI[imx8mq.md5sum] = "b5034e35dca3c2b6c1b4d38b16cddaa7"
SRC_URI[imx8mq.sha256sum] = "ec44b737630c088dd23c1f855ce8478bae531d75a9c7021eb25e9268a8b9a425"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
