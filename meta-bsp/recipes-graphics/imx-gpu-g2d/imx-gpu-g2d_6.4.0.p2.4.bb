require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "28a30a5c3e9b28d953e3e4477ee145a4"
SRC_URI[aarch64.sha256sum] = "c135db542d112cab968f2915c269963bbd76fe414387046f4030a24bcb04fb0b"
SRC_URI[arm.md5sum] = "89057e3bf60316fbe1a0e64fe4dea134"
SRC_URI[arm.sha256sum] = "541967d39f52928379d652bc57699b7f026f424f556b1efdca6b703b541516ad"
