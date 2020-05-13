require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "beb0fea7294fd996b9096aaa7969dc39"
SRC_URI[aarch64.sha256sum] = "08af4277f4d7ee9db77ae72b66a0d1eb1eb656cdd80f1bdbd2f2473f728c2b31"
SRC_URI[arm.md5sum] = "027da858374887ecdf3876a976299dc3"
SRC_URI[arm.sha256sum] = "a9ab58887ffcd126368e28730c1c9bad67a3aaf3ea06460187155e4b4e94e152"
