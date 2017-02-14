# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI += "file://Stop-using-Git-to-write-local-version.patch"

SRC_URI[md5sum] = "f6babced7ec9ad8468670d4ae844f8ef"
SRC_URI[sha256sum] = "db06b3aa24173c4e58207ac5e0103b89f7daf097604313854d65aff9c072a38b"

