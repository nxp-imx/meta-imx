require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7ea8171694a8ab04e1b1782b8a14b431"
SRC_URI[aarch64.sha256sum] = "988cd130a8ea77363173577c48959463525929c963312dbbccea2f686b66caa2"
SRC_URI[arm.md5sum] = "8b29609ca02afa760fa2f5655f1c2987"
SRC_URI[arm.sha256sum] = "4c5576eaaef8ea201161d713ff9b38447bdc63bd099b6866d9d0da013bbd45e9"
