require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "4c06b51e5bc49054a6ffeefb9ce1a875"
SRC_URI[aarch64.sha256sum] = "820066c381c761893d7e09220cbbb3914502161e8b5c651b2223fe33ec76f2c6"
SRC_URI[arm.md5sum] = "626f739d826b8596e7c61213f5e8b307"
SRC_URI[arm.sha256sum] = "90eb4fe9d7a337d49eb5db010b76e68202efdb2fdc97484cead1d98eda1d814f"
