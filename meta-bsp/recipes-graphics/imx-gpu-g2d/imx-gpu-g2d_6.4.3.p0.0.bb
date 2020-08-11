require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a32b1034a8ccdfd470014212b60ba114"
SRC_URI[aarch64.sha256sum] = "9b77f2157532bf2a41e92fd2c3865c87c6cc9a9f0d6c760525f605d8f9eb590d"
SRC_URI[arm.md5sum] = "763c6ee5d690b150ceebad4a071d46e2"
SRC_URI[arm.sha256sum] = "50ab298ef32a086a663793dd305d0c099fc5d9cec184813b44d454b427035a1b"
