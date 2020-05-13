# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

SRC_URI[imx8mn.md5sum] = "21b718fab2c4e77c8a848667698d74d1"
SRC_URI[imx8mn.sha256sum] = "e877c7462b6ea87c498563842f42352d204eb28a65f35f7dc1fec643f84abb66"

SRC_URI[imx8mp.md5sum] = "71f1519b432be4d8c855f87b0a95e160"
SRC_URI[imx8mp.sha256sum] = "a3b76a851f52ed927b919630ca06ac1d7317d9fae02bf6588683781fa4650550"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
