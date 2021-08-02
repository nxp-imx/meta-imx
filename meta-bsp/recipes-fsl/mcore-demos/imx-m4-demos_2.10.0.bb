# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[imx7ulp.md5sum] = "8dc66183e85749549252c843e0ee537c"
SRC_URI[imx7ulp.sha256sum] = "5357dd6cd8ffa70afeae3e3c94ef531f3a4982f5e1d033df0de7a4873af92e02"

SRC_URI[imx8mm.md5sum] = "19c16b17e1891bfb7cada584ee080928"
SRC_URI[imx8mm.sha256sum] = "22fb89c289b720aa6b371ca13f4892b681a9812104b6af44a30d4e65f1f51b60"

SRC_URI[imx8mq.md5sum] = "4500e56895e06ccc58edd029d0a0612f"
SRC_URI[imx8mq.sha256sum] = "9f8df501a16ede9e06d7557e69db87cdfe055368090c52a52b5c6afec7829c87"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
