require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0a3995f6cd4525582e5adf946fc4d29f"
SRC_URI[aarch64.sha256sum] = "c094c0466959334b6f48408aab6466eb2adeb626d9d588a1967106d2957fb5cc"
SRC_URI[arm.md5sum] = "a3227e4a24262287c0cf748834fd73c5"
SRC_URI[arm.sha256sum] = "cf823b6d8713e27330dbcfc6a15f3a7ff2a18ac1cd64f9113e5ee5b70ac48e4d"
