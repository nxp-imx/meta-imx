# Copyright 2019-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8mn.md5sum] = "c25e8463414f31f812e997748a5c3eba"
SRC_URI[imx8mn.sha256sum] = "8795f5947334eb2eae4a16c51eabd3cf50d8d04894b12933d8e78669433f7093"

SRC_URI[imx8mnddr3l.md5sum] = "f2e0741c26f59d2b7bf0b685d236ea6f"
SRC_URI[imx8mnddr3l.sha256sum] = "86039ee610ebb66cf1e65aa915cee2aeff5982f73504cebc9a94fba40095f3e1"

SRC_URI[imx8mp.md5sum] = "c31bb937d408dd8b3c6917ad252a4748"
SRC_URI[imx8mp.sha256sum] = "8d23cd58d6d31c9fff7912bb2551bc64a2f5db921ceea2674441211e13562c2f"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
