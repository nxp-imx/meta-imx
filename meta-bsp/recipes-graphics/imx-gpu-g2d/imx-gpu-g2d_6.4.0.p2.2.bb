require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "c72ceedb636e5cec825a1e6f1e5feea7"
SRC_URI[aarch64.sha256sum] = "023476d233a2ec3e0ce6e25d005bd9dc3a68f3d8a819d20fcbc23da5d1e9ec90"
SRC_URI[arm.md5sum] = "d9d2642b32ab70fed967432f7602172d"
SRC_URI[arm.sha256sum] = "bd5781c54c02f070a12b322baaf202cabade051df046afb97520e14b2eaed20c"
