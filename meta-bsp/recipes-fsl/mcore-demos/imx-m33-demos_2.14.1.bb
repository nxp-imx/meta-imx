# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI[imx8ulp.md5sum] = "62769addcc61455bfa08efa0af476366"
SRC_URI[imx8ulp.sha256sum] = "03b9b7107fcfe8e21c56d148ffc5c5f7293e12058836f10fdd958ff1f623dbad"

SRC_URI[imx93.md5sum] = "bd6eb48c527c3ba2ad32fa6ae1f1495a"
SRC_URI[imx93.sha256sum] = "a3fd0c9a724dde1785959ee12bbdb9ff604db0bced005e81b19a47b877013884"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
