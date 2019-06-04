require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "f70a708b2a7b467d6d0c9cbc475f9d78"
SRC_URI[aarch64.sha256sum] = "3b25c3ffc51bb3010aa84101007522eb6a1596a1df770c180847595067710ff3"
SRC_URI[arm.md5sum] = "2d195ade5a0692e69a119758bc7d65d2"
SRC_URI[arm.sha256sum] = "45be6487ab8733e201f4dcb0b5a55ec0c48b7303a719c37bf59d38b899ae9c07"
