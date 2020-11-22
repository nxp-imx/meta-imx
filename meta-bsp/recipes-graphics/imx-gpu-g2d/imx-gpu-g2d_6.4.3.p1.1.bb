require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e7911e86170ba070d1a23b50f132367d"
SRC_URI[aarch64.sha256sum] = "5d14d6a97117390094831a9854510c42e8cde959ee4760d7c195c6d2eac99e42"
SRC_URI[arm.md5sum] = "dc16983a9fe5cde91985d69747ce07b3"
SRC_URI[arm.sha256sum] = "913a9ca903861f660ec217c04d0e0ae745b71ce77eb37268008deafede958203"
