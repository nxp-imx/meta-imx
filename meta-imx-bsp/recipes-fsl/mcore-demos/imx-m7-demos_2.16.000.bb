# Copyright 2023-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx8mn.md5sum] = "b7e2733d8f6c9469b52b36cf6dad1c5e"
SRC_URI[imx8mn.sha256sum] = "ab608d621c8d74f42514799a732414184bd22f058a8a87a0ab75147a0fd5d99c"

SRC_URI[imx8mnddr3l.md5sum] = "c99fdb271ab42390537845a6beb15cf3"
SRC_URI[imx8mnddr3l.sha256sum] = "9c9477db2581640395ec3bc7524f89c2c09ffd2947d9186959343a8cf764ad28"

SRC_URI[imx8mp.md5sum] = "f12cd36cd48cfc65ada700445f8cecaf"
SRC_URI[imx8mp.sha256sum] = "f2da9e7d7ea6d7b5f33eb12d20e6c5c07fe3110d362f5263d672729f2cd73b37"

SRC_URI[imx95.md5sum] = "2e981ee32faeb5cbad269ef0df44662f"
SRC_URI[imx95.sha256sum] = "0d2ed03ddf82da963d6d6de78c64d1ee806a5535f1eabbd95e5f0c438966b721"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
