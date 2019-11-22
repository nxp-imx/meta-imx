require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d1f089d0c3c4d86ef49619ed96b66940"
SRC_URI[aarch64.sha256sum] = "9e6d1f0f4d426f5480528444cd7935828c0d621342c3e1ca84e403d8c93d175f"
SRC_URI[arm.md5sum] = "43247b168c447d3ed20710080810d04d"
SRC_URI[arm.sha256sum] = "b2e35b9478bc169728f9268ee1cf037320ddd423da9efa48e0a92c5653598306"
