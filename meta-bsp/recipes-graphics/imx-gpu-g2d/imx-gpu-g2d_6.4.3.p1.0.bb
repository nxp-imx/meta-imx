require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e5838b7c6d4b3d4054f320bc76594399"
SRC_URI[aarch64.sha256sum] = "ff57cd91f4363cb828a43182ed1034fbb76d06513351d7cf41df8674f0221cff"
SRC_URI[arm.md5sum] = "b57e6bdb550fb905bab7563a8426a0d9"
SRC_URI[arm.sha256sum] = "5f7e814c57b29bcbcb7106c2a75fbda2dbf6f5c4312a2b7505cf44de14e31805"
