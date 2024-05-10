# Copyright 2023-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx8mn.md5sum] = "b7e2733d8f6c9469b52b36cf6dad1c5e"
SRC_URI[imx8mn.sha256sum] = "ab608d621c8d74f42514799a732414184bd22f058a8a87a0ab75147a0fd5d99c"

SRC_URI[imx8mnddr3l.md5sum] = "c99fdb271ab42390537845a6beb15cf3"
SRC_URI[imx8mnddr3l.sha256sum] = "9c9477db2581640395ec3bc7524f89c2c09ffd2947d9186959343a8cf764ad28"

SRC_URI[imx8mp.md5sum] = "4260822516833e8cedec61dd5be24e3e"
SRC_URI[imx8mp.sha256sum] = "672af1e1d8fcc1ebd12b45c6dc4cfc7abc85ea9ebbf114d15f4bfe7540e24ea1"

SRC_URI[imx95.md5sum] = "9414b73281c4174398e2177d45e52b7f"
SRC_URI[imx95.sha256sum] = "0a9721101e1a105d08cca0525564322894bfcc4437070a1fcd4a778dee8b5237"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
