require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "bca26191b7da22e4fef615c4e8c92d00"
SRC_URI[aarch64.sha256sum] = "8d9841b9249beddef1893085a5cd37b5a4aba3c8f688ef0b6bf600eb0d62f0ce"
SRC_URI[arm.md5sum] = "050f21fb110bd3f32ae1d11ec7b94e8a"
SRC_URI[arm.sha256sum] = "155356d9282309413712c0ddb45023cd2b1404e5ff540078128f2d37cd4a00e2"
