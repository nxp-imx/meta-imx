require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2c17220ff2c28701b5feca45b341961f"
SRC_URI[aarch64.sha256sum] = "47a39b171d83bced378b1b4f408be6304850fe2f25bf4577dd1ea78e22473f3d"
SRC_URI[arm.md5sum] = "968a7d324016376930579a0f904d6e69"
SRC_URI[arm.sha256sum] = "8d3b024151d4bdcc4f68cdbba9c4e5d126d55c9258de5821c43b393ae3f840b4"
