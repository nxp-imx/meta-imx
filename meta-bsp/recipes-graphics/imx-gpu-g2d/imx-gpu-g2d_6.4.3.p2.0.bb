require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "503c5e26b1e02d65406b36dd0071df1c"
SRC_URI[aarch64.sha256sum] = "98bfca5ee78d651ccb9292d9f3e875d6f76b9d213500913c024677cf94f0eef4"
SRC_URI[arm.md5sum] = "f0f77a0bb5139aa8c3b732af586ecbfe"
SRC_URI[arm.sha256sum] = "774594f3e043602985a845b305942156a176de43355d2cebc2661735c601074f"
