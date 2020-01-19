require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "0e56241ecc7421ea4f0bb5c3dd803fed"
SRC_URI[aarch64.sha256sum] = "f4c1cf0dbda0b4a1113cbfa094a23e42cbc825c951e5c5f05bf9f68951252829"
SRC_URI[arm.md5sum] = "d9d2642b32ab70fed967432f7602172d"
SRC_URI[arm.sha256sum] = "bd5781c54c02f070a12b322baaf202cabade051df046afb97520e14b2eaed20c"
