# Copyright (C) 2013 Freescale Semiconductor

include imx-lib.inc

SRC_URI += "file://imx-lib-yocto-Makefile-changes-to-build-on-Yocto.patch"
SRC_URI[md5sum] = "60846fef897e4c6b77b5165e46cb0c44"
SRC_URI[sha256sum] = "314bd1f148fb2a749219a871d1fc80a90e1b8e78151f7c3efc3a2c76d7c0d166"

PE = "1"

COMPATIBLE_MACHINE = "(mx6)"