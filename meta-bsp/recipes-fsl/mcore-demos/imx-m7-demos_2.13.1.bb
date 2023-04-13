# Copyright 2019-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"

SRC_URI[imx8mp.md5sum] = "c31bb937d408dd8b3c6917ad252a4748"
SRC_URI[imx8mp.sha256sum] = "8d23cd58d6d31c9fff7912bb2551bc64a2f5db921ceea2674441211e13562c2f"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
