require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2c17220ff2c28701b5feca45b341961f"
SRC_URI[aarch64.sha256sum] = "47a39b171d83bced378b1b4f408be6304850fe2f25bf4577dd1ea78e22473f3d"
SRC_URI[arm.md5sum] = "27d6a89c1cf44ada9254686213c24776"
SRC_URI[arm.sha256sum] = "4fdf2d11b9670e5966ddb1e8cf2db97e5be9425d8fbc6838435901a03bc587d8"
