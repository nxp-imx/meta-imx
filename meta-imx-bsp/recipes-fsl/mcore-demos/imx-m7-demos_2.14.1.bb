# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=44a8052c384584ba09077e85a3d1654f"

SRC_URI[imx95.md5sum] = "111322759899931db68072bffd043664"
SRC_URI[imx95.sha256sum] = "48388a61bb4fa9cc1490fb4a14f104e74022f5c8ec987e4ea3ed7eb2c66d44bf"

SRC_URI[imx8mp.md5sum] = "f12cd36cd48cfc65ada700445f8cecaf"
SRC_URI[imx8mp.sha256sum] = "f2da9e7d7ea6d7b5f33eb12d20e6c5c07fe3110d362f5263d672729f2cd73b37"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
