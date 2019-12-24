require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cdf9804b2c31da41fa462e6b494b3974"
SRC_URI[aarch64.sha256sum] = "017bc8f1b718aa3c78550048c35ba37bfbbd19916044f0199667730548917b54"
SRC_URI[arm.md5sum] = "564963b9f1b191588c0527be02c71250"
SRC_URI[arm.sha256sum] = "00d92ccd0984645d9b78efeb280d83c6f68165660453e76853c5e202eaf0fbd2"
