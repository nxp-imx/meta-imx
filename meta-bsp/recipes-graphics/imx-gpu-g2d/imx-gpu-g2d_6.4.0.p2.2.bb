require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6ced98f4d1ce58d77b3d2012b4ffec76"
SRC_URI[aarch64.sha256sum] = "dae01e855702bfce2928dd74be0396d1534b7555bd79f22011a60a5317ef0235"
SRC_URI[arm.md5sum] = "e47ff1da6264ef0bf3366eaabf1d3719"
SRC_URI[arm.sha256sum] = "37a920af8018dd3fba113657e1ec8b9ec2256bb506ef70e75378ba65b367d34d"
