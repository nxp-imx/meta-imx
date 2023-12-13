# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI[imx95.md5sum] = "4dc6dd694190de11db8be6884dcf394e"
SRC_URI[imx95.sha256sum] = "a6018f45a406d67800cfd1e5af7990a721857101f15b96b58f9ab2ae9598a34f"

SRC_URI[imx8mp.md5sum] = "f12cd36cd48cfc65ada700445f8cecaf"
SRC_URI[imx8mp.sha256sum] = "f2da9e7d7ea6d7b5f33eb12d20e6c5c07fe3110d362f5263d672729f2cd73b37"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
