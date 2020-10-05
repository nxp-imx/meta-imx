require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "3ca36bd5c35c1d261c5cf22210592429"
SRC_URI[aarch64.sha256sum] = "f50773b5e5fb27a663cb35001909783374dfbd1c12406cf0ce7d7967d6cf247b"
SRC_URI[arm.md5sum] = "ed8bd74125a0b00631feddb1e706253c"
SRC_URI[arm.sha256sum] = "dba9e40f54443e630c497e1aa79ac0c337c19674d5c699f1acd90289070015df"
