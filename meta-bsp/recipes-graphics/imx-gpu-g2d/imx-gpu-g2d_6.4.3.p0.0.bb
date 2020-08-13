require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "beee40123904000798c6f498d505194d"
SRC_URI[aarch64.sha256sum] = "4cdffb0959ba8a5d75f6686ce9382b65c370d46da5d3d7e52d9267dd22d9cad8"
SRC_URI[arm.md5sum] = "6028f94e624a0f9d617fc9de231dd71b"
SRC_URI[arm.sha256sum] = "3f982115b1199849b8c5c58a9187366e94db3be956cb9cd36a664be50ef5b4ef"
