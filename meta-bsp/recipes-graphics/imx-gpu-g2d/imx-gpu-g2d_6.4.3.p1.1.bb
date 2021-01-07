require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2b38ba6d432c491cb103388d747d62ad"
SRC_URI[aarch64.sha256sum] = "ca062285df9f836ac4e73b3ab358d9a155276496eecdf4390a2cfb0057c574ac"
SRC_URI[arm.md5sum] = "83cf57f257eefc7846ca08980fbfd3e1"
SRC_URI[arm.sha256sum] = "38437dc25fc4bb3b051d4b98b3c609abaf9264bbe6bd9faf08534fc97fcf44c6"
