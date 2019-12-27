require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6f84513a1e72892146345d15624abf23"
SRC_URI[aarch64.sha256sum] = "a55d1a23616defeb78063a930fa00ca2f2ee20b0857eb62cf49a82a48be6c6cf"
SRC_URI[arm.md5sum] = "b8cdea896f12d5604108141200e1e80f"
SRC_URI[arm.sha256sum] = "fd496b752b9c088559a9d0a8e16f3e26bf5cd7db3fbcae6a42bf3a796cde82d4"
