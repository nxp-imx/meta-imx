require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "5c3ce335ad3c842f3d1d12a85c7d4c29"
SRC_URI[aarch64.sha256sum] = "4782cf836b8f6aa8898ee597e4099509abf7fb3176f8fec4ea904faa58e240f7"
SRC_URI[arm.md5sum] = "65f885f919feba3882b07453be7ab6e1"
SRC_URI[arm.sha256sum] = "1bcb919d3ef3684792e702ddc26bafc216682fc612e151bdfa045bedf82e7748"
