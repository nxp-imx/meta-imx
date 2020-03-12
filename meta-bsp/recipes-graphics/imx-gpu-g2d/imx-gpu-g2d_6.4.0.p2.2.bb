require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cc9223df55f78bf013110207f11e2a30"
SRC_URI[aarch64.sha256sum] = "679d2a93bd793f32fa81bbd284de6aec1d62f8098e16df1118b1aa4a63fccb9d"
SRC_URI[arm.md5sum] = "a409cbf213d3ec684c4202f8961d1d70"
SRC_URI[arm.sha256sum] = "d658088748930a04a03e50aa245b90e3e5e3e04fdfb78edc59ba453f780aa99b"
