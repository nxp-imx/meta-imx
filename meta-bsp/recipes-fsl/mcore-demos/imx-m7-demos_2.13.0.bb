# Copyright 2019-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"

SRC_URI[imx8mn.md5sum] = "d7ade5eef38ebeb297eb855d4bf565eb"
SRC_URI[imx8mn.sha256sum] = "ba7f078d17369e3a9e3ddd74dbe3853cbfa127ad1cbdb7fd2b99f58427a5bfb1"

SRC_URI[imx8mnddr3l.md5sum] = "c0768666809999af84d8a529b8ec140f"
SRC_URI[imx8mnddr3l.sha256sum] = "79d716e0d4de689bb0cd015a3d2102e28bfa0f89291fb61210a72bc0afec442e"

SRC_URI[imx8mp.md5sum] = "f8d11f51d3c30c8d06df1e2da6852218"
SRC_URI[imx8mp.sha256sum] = "21ebebaf38a4334e1aabea4a91a5c6a5580e474f45c49d8a4623e4376f1e585d"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
