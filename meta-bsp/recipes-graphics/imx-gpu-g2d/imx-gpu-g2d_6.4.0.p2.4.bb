require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "7853a5fcfdaf5036251834993a3487c4"
SRC_URI[aarch64.sha256sum] = "94592a48aedb0f4249d0c94536f691b1b29f4f7e58366dd989b3d3ce79765c53"
SRC_URI[arm.md5sum] = "1c0283aa1bbd327b4ac51029ef724862"
SRC_URI[arm.sha256sum] = "4cd3de2d2407d1b4cec3d3b82c9be9efd4a3b731d273202e50e23cf6a49a13d2"
