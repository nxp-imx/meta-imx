require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "45c4d707bc3b2d6a0c3125062781d1fd"
SRC_URI[aarch64.sha256sum] = "01e627b6f57b57071fe6b9523bffc444dae1e436c21aa33880d22a2865a7474f"
SRC_URI[arm.md5sum] = "c7d3f2174a448c50b3eb24644516c676"
SRC_URI[arm.sha256sum] = "7346abab78348b5af526bf87055653cbb8834db72665c772acd52ab8d7d90276"
