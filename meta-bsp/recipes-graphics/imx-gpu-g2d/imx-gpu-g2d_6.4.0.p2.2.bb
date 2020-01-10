require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "ad6b3f654f1a3be95564bafd2329997a"
SRC_URI[aarch64.sha256sum] = "fcb3c231211075df0ad3904d4fe80cbe7b7fe5a3925d8bd010cd98d84468035f"
SRC_URI[arm.md5sum] = "8b2fe5610cba4e42a2e534ee0e21b94c"
SRC_URI[arm.sha256sum] = "a8937f932a4c9be3e7a226417ea5851096a0beb9211d6556f031dcfee0004a83"
