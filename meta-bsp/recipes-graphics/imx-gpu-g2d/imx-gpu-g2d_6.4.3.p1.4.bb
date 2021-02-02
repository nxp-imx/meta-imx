require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2c17220ff2c28701b5feca45b341961f"
SRC_URI[aarch64.sha256sum] = "47a39b171d83bced378b1b4f408be6304850fe2f25bf4577dd1ea78e22473f3d"
SRC_URI[arm.md5sum] = "6f9ead29e39b1904d80183af59056323"
SRC_URI[arm.sha256sum] = "9ccf7c4d3854e5988a326bd16d75aee53fa665603d2d78ba162974c1532a4509"
