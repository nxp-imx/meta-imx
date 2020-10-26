require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cccc646f7b3ad2486b7bc2195540d6a7"
SRC_URI[aarch64.sha256sum] = "5e33775af625615eb404046bab808d4b85b710943343e0a3ef65fd4522ebba33"
SRC_URI[arm.md5sum] = "e7ccfb2e82d4953c2d844db221e74906"
SRC_URI[arm.sha256sum] = "37acb635849ffdbb88b2a1df3bc047fcd453ce25931de03a4afabdaeb6ed3ebf"
