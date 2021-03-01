require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "94031a7dc1dcd63b7f51a9d6ef111f1b"
SRC_URI[aarch64.sha256sum] = "c9c7060b4f0b9eca0bf654a2832275bb7854d22d7db292778b190290fb4277ed"
SRC_URI[arm.md5sum] = "a30eb1617ecf19e4ec23e5c253473e19"
SRC_URI[arm.sha256sum] = "1119dc0c2f0423ae4eb44c7dbdc87fe2c9ac95fd49e63ef2abba42396786e6bf"
