# Copyright 2019-2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=add2d392714d3096ed7e0f7e2190724b"
LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=ea25d099982d035af85d193c88a1b479"

SRC_URI[imx8mp.md5sum] = "aa2bd4a77970396418a4879827ca6da7"
SRC_URI[imx8mp.sha256sum] = "d98d90ccef16b39b6a5756a91f08be69448bbf58cbb9216db5fcb7d03ae042f4"

SRC_URI[imx8mn.md5sum] = "5ba15434b72f1eb7315e6ddb8a66a0f9"
SRC_URI[imx8mn.sha256sum] = "8fe6c76da7eb0bbebb8e18a308249ca78a1c5c1d58034cf0fd3c5028aa5740e2"

SRC_URI[imx8mnddr3l.md5sum] = "f2e0741c26f59d2b7bf0b685d236ea6f"
SRC_URI[imx8mnddr3l.sha256sum] = "86039ee610ebb66cf1e65aa915cee2aeff5982f73504cebc9a94fba40095f3e1"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
