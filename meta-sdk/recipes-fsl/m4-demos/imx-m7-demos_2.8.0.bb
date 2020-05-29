# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[imx8mn.md5sum] = "21b718fab2c4e77c8a848667698d74d1"
SRC_URI[imx8mn.sha256sum] = "e877c7462b6ea87c498563842f42352d204eb28a65f35f7dc1fec643f84abb66"

SRC_URI[imx8mp.md5sum] = "3dd44131b41dd902a8ce1b53eb9a0cd6"
SRC_URI[imx8mp.sha256sum] = "c7ed19d1d164c910af114d58fc53628b6e237262e657e082ac7beb685f0398ec"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
