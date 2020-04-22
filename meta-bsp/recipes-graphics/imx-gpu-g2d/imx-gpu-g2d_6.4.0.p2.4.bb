require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6165c9832cb7a6225e81d58f681f7a62"
SRC_URI[aarch64.sha256sum] = "1e6b1c6d8e1ce464c39e832c5805dfaee426250d165c09184edee5c718b1e43d"
SRC_URI[arm.md5sum] = "a971a7b97f3eb9180f54d6aa2c019421"
SRC_URI[arm.sha256sum] = "015fc17759dfb5571dec4fc2519a8a949126a8c274e1cda1476a3f4913d8994b"
