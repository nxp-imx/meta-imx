# Copyright 2023-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[imx8ulp.md5sum] = "6a1d2b904255ad2b514a234e6282209f"
SRC_URI[imx8ulp.sha256sum] = "eb8710c31dd58e23ed50653a1b90106e78776a1062abea2a16139cf371828a5a"

SRC_URI[imx93.md5sum] = "2fad663ff63d273a2cb775e06db9eedc"
SRC_URI[imx93.sha256sum] = "257066cbd57add127fae15da72f12f1cf6a847ff300e7b4ac63f507693898dfa"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
