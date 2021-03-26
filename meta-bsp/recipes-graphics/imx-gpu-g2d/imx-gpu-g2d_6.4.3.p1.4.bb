require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "575eac63da712019bfe3ac4c616b2774"
SRC_URI[aarch64.sha256sum] = "017e8c40a51311bb384a427467ec6950f91879b9e36c48074dd29c6ca7db8c4f"
SRC_URI[arm.md5sum] = "9eab89a12949534a5a45050c24ba4cba"
SRC_URI[arm.sha256sum] = "a5ee498e47e52cbc56292d5ea8d71b5194775c750fa0415a43ea05ddb1acb08a"
