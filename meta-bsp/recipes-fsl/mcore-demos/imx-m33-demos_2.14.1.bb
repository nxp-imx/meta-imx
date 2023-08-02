# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8ulp.md5sum] = "e44631b2d0f39a1d062e5eacfc1a08ae"
SRC_URI[imx8ulp.sha256sum] = "bb94a035cac226617dd15b218b397b4eb2d12749610f9b7be6fb9e63363e06ea"

SRC_URI[imx93.md5sum] = "bd6eb48c527c3ba2ad32fa6ae1f1495a"
SRC_URI[imx93.sha256sum] = "a3fd0c9a724dde1785959ee12bbdb9ff604db0bced005e81b19a47b877013884"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
