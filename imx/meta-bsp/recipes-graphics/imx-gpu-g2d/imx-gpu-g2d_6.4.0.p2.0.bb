require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3112b7c775a8687988792db105e5b8d2"
SRC_URI[aarch64.sha256sum] = "56fdf2d55704bc8d7e2d6531ce808c5714b88fa14530c83774df310ea7633f2b"
SRC_URI[arm.md5sum] = "c0621a2ffa0b0ec5518158f2d6c44ccc"
SRC_URI[arm.sha256sum] = "a0ccc8f48a5fe8c97cab702ac539a6c92d28e7da85da49c749b58c97be499194"
