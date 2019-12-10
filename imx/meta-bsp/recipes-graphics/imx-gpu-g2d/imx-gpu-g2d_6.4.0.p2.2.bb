require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d06372d08cb09b8d4737c5712e39b57f"
SRC_URI[aarch64.sha256sum] = "6f1f6e41ee097d5d5fbcbd33e92a9f84ba4d83b08f717968a3d9a275d123e70e"
SRC_URI[arm.md5sum] = "6d5639285d4ec463a0870314bb401264"
SRC_URI[arm.sha256sum] = "9657f70ddf52384dab9cffe0b2d59cbe0700e97009017211664e90e03e8924e7"
