require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7ea8171694a8ab04e1b1782b8a14b431"
SRC_URI[aarch64.sha256sum] = "988cd130a8ea77363173577c48959463525929c963312dbbccea2f686b66caa2"
SRC_URI[arm.md5sum] = "f76bab886160e489a6c11cc4b873a629"
SRC_URI[arm.sha256sum] = "cc64ea9130b4584e2ee3d2bf5420d39435257d66e2e520f1bc41db6f10c9052c"
