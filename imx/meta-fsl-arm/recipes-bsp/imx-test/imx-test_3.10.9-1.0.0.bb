# Copyright (C) 2013 Freescale Semiconductor

include imx-test.inc

PE = "1"

SRC_URI[md5sum] = "d5782a1fbb4a64d2d76617de31a5e3f2"
SRC_URI[sha256sum] = "599a798348fdbcd0ed162813b8e1ec6cc764dfe14e7c7a069f96f3abbfa75f72"

SRC_URI += "file://imx-test-disable-components-to-fix-build-breaks-in-y.patch"

COMPATIBLE_MACHINE = "(mx6)"
