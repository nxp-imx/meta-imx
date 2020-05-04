require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "b6c24bc281a7ea7e45f7d82705763f5e"
SRC_URI[aarch64.sha256sum] = "44bf9107674dce1e0d5ff86c15bd2433c4538615663f0f25c7f7726af0d8f33b"
SRC_URI[arm.md5sum] = "89057e3bf60316fbe1a0e64fe4dea134"
SRC_URI[arm.sha256sum] = "541967d39f52928379d652bc57699b7f026f424f556b1efdca6b703b541516ad"
