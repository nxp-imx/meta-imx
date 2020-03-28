require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a85121032bbecbe8252c808c09c5a721"
SRC_URI[aarch64.sha256sum] = "991f8ee068e72babf40425f6c9df83299e47df64a952aa27817af7ba67366127"
SRC_URI[arm.md5sum] = "109fb6a3716046b166a7a17905fe2329"
SRC_URI[arm.sha256sum] = "008197a4f4f65bbff8af6bb98ee1317801491a9ce83c8935005480326b89f1c8"
