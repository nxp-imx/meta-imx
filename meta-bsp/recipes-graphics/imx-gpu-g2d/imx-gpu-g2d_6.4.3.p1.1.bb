require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bca26191b7da22e4fef615c4e8c92d00"
SRC_URI[aarch64.sha256sum] = "8d9841b9249beddef1893085a5cd37b5a4aba3c8f688ef0b6bf600eb0d62f0ce"
SRC_URI[arm.md5sum] = "344bdfdf2084eb96af0482e497627a82"
SRC_URI[arm.sha256sum] = "d8cc4aafaadef6e7906b2909342595c2edfd6f6b612e619a1a6966336ea427c8"
