# Copyright (C) 2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

SRC_URI[md5sum] = "8afd05cd215eac90d898da75a20828ae"
SRC_URI[sha256sum] = "d17f1d8abade93f9e642e95a51c294f43ba3f63567f0b937ba01b2c7504e2a8c"


SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-3.10.9-1.0.0.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-3.10.9-1.0.0"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
