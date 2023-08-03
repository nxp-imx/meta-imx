# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8ulp.md5sum] = "91f086df95fae766ecbd000d40f736eb"
SRC_URI[imx8ulp.sha256sum] = "d09718dd1d182a6bb2a7e4c30181fa3a454bb7b95ae9ce873165a8b22b033397"

SRC_URI[imx93.md5sum] = "bd6eb48c527c3ba2ad32fa6ae1f1495a"
SRC_URI[imx93.sha256sum] = "a3fd0c9a724dde1785959ee12bbdb9ff604db0bced005e81b19a47b877013884"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
