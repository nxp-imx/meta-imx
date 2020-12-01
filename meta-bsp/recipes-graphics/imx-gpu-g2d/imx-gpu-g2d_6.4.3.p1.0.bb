require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5864c325d8cc1e842598905f72b8013a"
SRC_URI[aarch64.sha256sum] = "bfee2f6fde15d11fdafb96926f6c10284a19d8505c4a10fa26ea77f4079a0d48"
SRC_URI[arm.md5sum] = "82d688982c1b9fb02596e1806c8e7b14"
SRC_URI[arm.sha256sum] = "2422bb162028c056a95f9ecb3d1506613ae287bf89a14dc42f2d10b8abdd7bbd"
