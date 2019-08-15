require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f802baef263c34653bbaf347cf24dcb7"
SRC_URI[aarch64.sha256sum] = "95572bf2e3ae589345ff4006b693ef883911ec5f1c7ba34813584d3327d371ec"
SRC_URI[arm.md5sum] = "2ca2022431e4e79932f7b685acd829a8"
SRC_URI[arm.sha256sum] = "e80f20eb60b2119c4d4647a8ed853288aa1324a29502f3931c96d9b9ae3a1d80"
