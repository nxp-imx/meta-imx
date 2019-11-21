require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "24c5e131a890bfadd8f8396deeddcb8b"
SRC_URI[aarch64.sha256sum] = "4cbd9c71b75b23af27de55ee7b12c0de536115f86a7ccf517d9359ddcacfcc06"
SRC_URI[arm.md5sum] = "aadf88c8677ca90d16c5afb5acfb936d"
SRC_URI[arm.sha256sum] = "9543b686ab4c0559be90df9c1c5c7c7eb0bc4983303127f38357d30a4befaa3c"
