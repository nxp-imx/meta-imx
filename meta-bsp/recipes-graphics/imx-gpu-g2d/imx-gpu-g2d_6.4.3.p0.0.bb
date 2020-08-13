require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "beee40123904000798c6f498d505194d"
SRC_URI[aarch64.sha256sum] = "4cdffb0959ba8a5d75f6686ce9382b65c370d46da5d3d7e52d9267dd22d9cad8"
SRC_URI[arm.md5sum] = "d543afa572bff504646281c3c91cd73e"
SRC_URI[arm.sha256sum] = "2c5df2d085d249b1ec2f848105b22bfb1bd0cd1bd91c511a5c3fffb0b03fc401"
