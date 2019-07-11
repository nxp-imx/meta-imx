require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "695c681e94a88f9f074e897e78faaf09"
SRC_URI[aarch64.sha256sum] = "3b792a1f9b6750642807936d6d0ffad9e82202be1dd56cde73989610e98f8cd9"
SRC_URI[arm.md5sum] = "e24e9f8dc5c9b41079d37c3e698ad709"
SRC_URI[arm.sha256sum] = "a21df2759f19260b66d3a51ff6dd170bba4ce1faf3636aa9a4eb16f3dd73336c"
