# Copyright 2019-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[imx8mn.md5sum] = "21b718fab2c4e77c8a848667698d74d1"
SRC_URI[imx8mn.sha256sum] = "e877c7462b6ea87c498563842f42352d204eb28a65f35f7dc1fec643f84abb66"

SRC_URI[imx8mp.md5sum] = "486aaae4eafe11e70fb52c6538e9181b"
SRC_URI[imx8mp.sha256sum] = "44dca9f259e2abfa456ad67eb4dc8d7b12b5b04afbd26f36c7c0a10a84f03da1"

COMPATIBLE_MACHINE = "(mx8mn|mx8mp)"
