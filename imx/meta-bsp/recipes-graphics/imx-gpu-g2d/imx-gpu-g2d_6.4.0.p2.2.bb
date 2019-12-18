require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "723c9fa1dbed87176aa4818dfc95eef1"
SRC_URI[aarch64.sha256sum] = "321e337211dcf7d50210b13700add910b1d0924f462a4d9957d7d4e52bdc45de"
SRC_URI[arm.md5sum] = "1368492d7043190afab4f82b4d2bb8b5"
SRC_URI[arm.sha256sum] = "8e30e3aaf2cf5f5b115c716fdf2342f7887d846d9a4403fbc9cbaf7071ffedbc"
