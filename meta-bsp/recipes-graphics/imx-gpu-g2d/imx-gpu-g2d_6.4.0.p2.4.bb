require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "1305a64613d5b5aa2541c8d62fb58641"
SRC_URI[aarch64.sha256sum] = "b89ce44a19d4b7536700731292ac12ae22ee97137f5d67f818571598e6edd481"
SRC_URI[arm.md5sum] = "e417073a6eb56c330f7629de5ead1cec"
SRC_URI[arm.sha256sum] = "7c1a3cf771d920762ee71d596fd0487820dce0b324bad873b3647920bd40620b"
