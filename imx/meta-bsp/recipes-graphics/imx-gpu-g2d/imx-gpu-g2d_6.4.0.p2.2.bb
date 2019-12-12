require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d06372d08cb09b8d4737c5712e39b57f"
SRC_URI[aarch64.sha256sum] = "6f1f6e41ee097d5d5fbcbd33e92a9f84ba4d83b08f717968a3d9a275d123e70e"
SRC_URI[arm.md5sum] = "a3227e4a24262287c0cf748834fd73c5"
SRC_URI[arm.sha256sum] = "cf823b6d8713e27330dbcfc6a15f3a7ff2a18ac1cd64f9113e5ee5b70ac48e4d"
