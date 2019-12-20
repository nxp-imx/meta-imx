require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "905fc1212c342ed0b82194cdbecf4263"
SRC_URI[aarch64.sha256sum] = "7f77723af405391adb0ed04c376d48ccb0cccdbcabdc3eed81b35a0ea5d70a1b"
SRC_URI[arm.md5sum] = "31dc42124e0c2b76b1aed41e0aac1414"
SRC_URI[arm.sha256sum] = "92fabf1dd01e8a1cffa9932d7b659332d4ba8fc71f502a0a6aadb420641df6a9"
