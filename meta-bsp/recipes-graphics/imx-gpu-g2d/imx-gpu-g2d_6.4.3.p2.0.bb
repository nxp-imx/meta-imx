require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d3b7354dfe3b6f7b630faf33421c1538"
SRC_URI[aarch64.sha256sum] = "9133387a171a3366a7df6c40c63b08e3db4c34dcd2b4f2eacc9d34d38f973cdd"
SRC_URI[arm.md5sum] = "b12c1bcd23501bde72f27823ac94d90d"
SRC_URI[arm.sha256sum] = "85d1aced6c2871b5f20398b2816538970baff9ecaa51412bb0ce261b1acc960f"
