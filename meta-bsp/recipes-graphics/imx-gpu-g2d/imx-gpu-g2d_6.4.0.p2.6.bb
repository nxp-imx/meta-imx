require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "d3da7eab92b9038eeb8528ab34c8458c"
SRC_URI[aarch64.sha256sum] = "3f65682be7ce9f16ae2813aca6b5909859f10d51b1672744175ed330a7336419"
SRC_URI[arm.md5sum] = "eea96e486ef61a137636730130f8ba66"
SRC_URI[arm.sha256sum] = "0ce46cbe1b8f3bb5d23283d6f314dc9e90a27c409c21b2a139a39d7a41c0959e"
