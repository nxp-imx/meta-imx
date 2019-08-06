require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49093b4ee57cda98d8e528a2c18398e5"
SRC_URI[aarch64.sha256sum] = "ace7c70bf42e6ef05ee8129885613eb35067eb2ae9b85f25242e7052c6553eb4"
SRC_URI[arm.md5sum] = "f76bab886160e489a6c11cc4b873a629"
SRC_URI[arm.sha256sum] = "cc64ea9130b4584e2ee3d2bf5420d39435257d66e2e520f1bc41db6f10c9052c"
