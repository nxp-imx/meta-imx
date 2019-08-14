require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "a08bbae3bfff55e283b63427bfbec75a"
SRC_URI[aarch64.sha256sum] = "f23c83e99b109c7841dfbaf106ca05a71123885b821e7ab69b8fc5399aa55d36"
SRC_URI[arm.md5sum] = "ed832193f25958cf27e171c7751c0862"
SRC_URI[arm.sha256sum] = "ad86d6b4c8080884580c07f394465ef91d28737dad0243095b16524be2a9aae3"
