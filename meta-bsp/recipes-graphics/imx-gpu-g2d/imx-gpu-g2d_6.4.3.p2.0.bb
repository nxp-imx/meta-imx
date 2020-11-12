require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "9f8fd7290d1c3e22c2d6bad620d64c77"
SRC_URI[aarch64.sha256sum] = "1be1b56b12132d03b08d7b5e4cc91f2ccc201cd32a8c77c0ad97fa46917edd96"
SRC_URI[arm.md5sum] = "344bdfdf2084eb96af0482e497627a82"
SRC_URI[arm.sha256sum] = "d8cc4aafaadef6e7906b2909342595c2edfd6f6b612e619a1a6966336ea427c8"
