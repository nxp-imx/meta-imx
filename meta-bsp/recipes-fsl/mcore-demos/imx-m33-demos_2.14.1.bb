# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI[imx8ulp.md5sum] = "62769addcc61455bfa08efa0af476366"
SRC_URI[imx8ulp.sha256sum] = "03b9b7107fcfe8e21c56d148ffc5c5f7293e12058836f10fdd958ff1f623dbad"

SRC_URI[imx93.md5sum] = "857fbbaba84ca8fdf92bc9fbb9235654"
SRC_URI[imx93.sha256sum] = "6d64e71847e49c36427ed82b954d37a8696151f8543b4879497d14c59f116050"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
