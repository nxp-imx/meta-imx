# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=2827219e81f28aba7c6a569f7c437fa7"

SRC_URI[imx95.md5sum] = "1eb4f4bcf4dd73c4f9af0bf8a007be68"
SRC_URI[imx95.sha256sum] = "482126f27a7c5b3244af6477efece07ff8017bb573df69f22040fc5c0de49ec5"

SRC_URI[imx8mp.md5sum] = "f12cd36cd48cfc65ada700445f8cecaf"
SRC_URI[imx8mp.sha256sum] = "f2da9e7d7ea6d7b5f33eb12d20e6c5c07fe3110d362f5263d672729f2cd73b37"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
