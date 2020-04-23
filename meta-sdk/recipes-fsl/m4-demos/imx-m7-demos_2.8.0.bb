# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[imx8mn.md5sum] = "21b718fab2c4e77c8a848667698d74d1"
SRC_URI[imx8mn.sha256sum] = "e877c7462b6ea87c498563842f42352d204eb28a65f35f7dc1fec643f84abb66"

SRC_URI[imx8mp.md5sum] = "75dfee8cc2663057ec04908c0316b173"
SRC_URI[imx8mp.sha256sum] = "ec1537a44dc0345e6d26dc2880ea3cb86c50fc148f20dab5d98cf596558b63ae"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
