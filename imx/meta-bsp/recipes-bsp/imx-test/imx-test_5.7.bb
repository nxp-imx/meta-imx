# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "341d1c7f0e0c2dedbdc09d126a03b7c9"
SRC_URI[sha256sum] = "6f0a90febb001363878e71a93acc9e5a4d4684b903a70fccef7929f58dc6a219"

SRC_URI += "file://0001-imx-test-Fix-Makefiles-to-handle-library-dependencie.patch"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
