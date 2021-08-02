# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos-2.8.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[imx7ulp.md5sum] = "8dc66183e85749549252c843e0ee537c"
SRC_URI[imx7ulp.sha256sum] = "5357dd6cd8ffa70afeae3e3c94ef531f3a4982f5e1d033df0de7a4873af92e02"

SRC_URI[imx8mm.md5sum] = "3ece10e2ca255e6964b405f17c9f6342"
SRC_URI[imx8mm.sha256sum] = "c14f6d2f41d2a16eb9f948c6182ef3fbb9dfccdd5399b78e2fe3fa8ae9006dde"

SRC_URI[imx8mq.md5sum] = "4500e56895e06ccc58edd029d0a0612f"
SRC_URI[imx8mq.sha256sum] = "9f8df501a16ede9e06d7557e69db87cdfe055368090c52a52b5c6afec7829c87"

COMPATIBLE_MACHINE = "(mx7ulp|mx8mm|mx8mq)"
