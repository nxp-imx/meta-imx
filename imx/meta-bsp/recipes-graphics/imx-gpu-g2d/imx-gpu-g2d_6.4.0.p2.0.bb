require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "24c5e131a890bfadd8f8396deeddcb8b"
SRC_URI[aarch64.sha256sum] = "4cbd9c71b75b23af27de55ee7b12c0de536115f86a7ccf517d9359ddcacfcc06"
SRC_URI[arm.md5sum] = "0777122de3f89b85c88fd9a4e8d0cb1a"
SRC_URI[arm.sha256sum] = "e278bb65e27db7495b1b408737bd74c72f76abc786f3576d25a0c7fd84987e2d"
