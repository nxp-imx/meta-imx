# Copyright 2017-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx7ulp.sha256sum] = "1fbb26f8e0a69a2e3925e07cf0cc4a13b13e3ff6321a2ba3dc39c454c82b398b"

SRC_URI[imx8mm.sha256sum] = "2d44d2b0d98d053e9b469dfdcd26efaf297e6c590c1b671e39865f29f8ea8c97"

SRC_URI[imx8mq.sha256sum] = "09b7195ce553dae5808afcefaf6f76c79f7122ce4dd31fabd679b768607dea25"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

