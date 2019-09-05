require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "2bd257e33e91027291277f39993ecbbb"
SRC_URI[aarch64.sha256sum] = "1e308737fc9aacc0786020369d124ae6d9a55b60b6efc8dab8656d3ddc4947db"
SRC_URI[arm.md5sum] = "23ce97d4221246613f764dd588df137e"
SRC_URI[arm.sha256sum] = "2813482f36b87687e962991e8dd94e1208575dcb43bbbb43a5b37f97005430c5"
