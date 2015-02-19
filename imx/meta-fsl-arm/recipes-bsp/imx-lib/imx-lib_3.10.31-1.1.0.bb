# Copyright (C) 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'alpha' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}_alpha.tar.gz"
S="${WORKDIR}/${PN}-${PV}_alpha"

PE = "1"

SRC_URI[md5sum] = "065e926db8a5f9c1e1884ce73cc1c658"
SRC_URI[sha256sum] = "9de55a486172771d86b1ba5c08104b8ce9eae105bae7eae0528051b334c83f56"

COMPATIBLE_MACHINE = "(mx6)"
