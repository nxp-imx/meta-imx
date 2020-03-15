require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "da5f29c5aca01e934225d6ae3f9f8ebc"
SRC_URI[aarch64.sha256sum] = "5239b945aabd9ef63b336dd93184a8b9a9baee5fa030ce9b6a1b232dbb991f61"
SRC_URI[arm.md5sum] = "f507ac37250de10a30df51ae4372a09f"
SRC_URI[arm.sha256sum] = "bc7446f273b09e3f153e86a43cd3a4a086c1c7b260ff388d1fdb9e31bac5c51d"
