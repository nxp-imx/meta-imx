require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "cd88d5e05c4e2db858c69dfd2f927d65"
SRC_URI[aarch64.sha256sum] = "9557005038f362ebe608f18c7436e9fe51ca414ef1036f96870813aecfef830b"
SRC_URI[arm.md5sum] = "3984f8c2d93d90f0dda81beba8d04cbb"
SRC_URI[arm.sha256sum] = "8b0fef68e4c2393f0aa4413e30fe6525c16adc8594a9ffc104c25b60e9785607"
