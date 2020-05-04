require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "28a30a5c3e9b28d953e3e4477ee145a4"
SRC_URI[aarch64.sha256sum] = "c135db542d112cab968f2915c269963bbd76fe414387046f4030a24bcb04fb0b"
SRC_URI[arm.md5sum] = "7a0d1848b64d024de4a310177db9e0eb"
SRC_URI[arm.sha256sum] = "e1e9d0eafeb882684f12c03fa374b8ca64ace5bb15f591c046dd7619c8b2386f"
