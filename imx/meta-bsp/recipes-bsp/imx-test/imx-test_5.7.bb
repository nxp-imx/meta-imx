# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "a2c6c5dbb3f40b95775fbc43d82a3f95"
SRC_URI[sha256sum] = "b5b7ab6781ab29da2ed12d7af2972bdb7fba157c25061d78844841694700ea9e"

SRC_URI += "file://0001-imx-test-Fix-Makefiles-to-handle-library-dependencie.patch"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
