require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "e221053bc66d6e2957f22ee0a30d5bd4"
SRC_URI[aarch64.sha256sum] = "a0bd3236bcdafbff31a425015a139072708d144c0410b1eb1612d3086bf92840"
SRC_URI[arm.md5sum] = "b9e4e50a33d1bbd255058c6a27b2749e"
SRC_URI[arm.sha256sum] = "bdaaf27b12903845c0a08b2c181702f6a50ea0cfecd0ca25dbca47cf17ee022f"
