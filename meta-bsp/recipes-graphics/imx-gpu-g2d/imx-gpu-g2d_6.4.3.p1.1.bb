require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5b652a451259ff348992c1ed28bb9f83"
SRC_URI[aarch64.sha256sum] = "0d523fb2473cc40c1de0650a7e3a23d68742fc135445b2403c4c36d6ce449984"
SRC_URI[arm.md5sum] = "ccd0f10be1f21da9d33452f0d4122420"
SRC_URI[arm.sha256sum] = "551f7db4d51d74d6cad20379c6a5dad611e6ba7e526774b5b20c2976c7ded5fd"
