# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=63a38e9f392d8813d6f1f4d0d6fbe657"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=d7853b7bf2936b2c25c893eac7033374"

SRC_URI[imx8ulp.md5sum] = "54918ad78118669cf9cc1556c1408cab"
SRC_URI[imx8ulp.sha256sum] = "7b91427f731e783e95b1710e94ff1f97dc820aaf1cc2e4c0ff9619937ad3b43f"

SRC_URI[imx93.md5sum] = "5a6035c1f797480531cc0ac9724a984b"
SRC_URI[imx93.sha256sum] = "e11de8b9587d8a3a425a6e8d7bcb23158657416071e43d8bf35dcb876b806ad6"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
