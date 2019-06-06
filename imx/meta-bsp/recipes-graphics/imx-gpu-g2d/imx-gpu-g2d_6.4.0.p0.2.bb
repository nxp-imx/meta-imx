require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "56c2146a3f57d1c028491bcadde273da"
SRC_URI[aarch64.sha256sum] = "b94b96ad38f7dea1acccc73769a9774d7f48bc6aecf7a12adfa288c89cefa5a7"
SRC_URI[arm.md5sum] = "929779dba815f852db88258ff04daad6"
SRC_URI[arm.sha256sum] = "c4069153ebe012b043dc45ac0c4a853f668af9339c6477aab98c7bcd89afa7cc"
