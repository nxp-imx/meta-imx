require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b6c24bc281a7ea7e45f7d82705763f5e"
SRC_URI[aarch64.sha256sum] = "44bf9107674dce1e0d5ff86c15bd2433c4538615663f0f25c7f7726af0d8f33b"
SRC_URI[arm.md5sum] = "4e1d45deb0d4d600e24ce2d5106694e6"
SRC_URI[arm.sha256sum] = "8715396b0b4683d2af31a5ae357bb93f14a338b4f93035b03d9c3ee6bf89634e"
