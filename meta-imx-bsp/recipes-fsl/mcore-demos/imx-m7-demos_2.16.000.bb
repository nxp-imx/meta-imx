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

SRC_URI[imx95.md5sum] = "14b362485894370b5cf67d6369c2488c"
SRC_URI[imx95.sha256sum] = "e2fa13367ba1feee7c9894bdbbf9a511705c04b1bbf6f3db016e7cb1f0581129"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
