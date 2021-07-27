# Copyright 2021 NXP
DESCRIPTION = "i.MX Hantro V4L2 Daemon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cd8bc2a79509c22fc9c1782a151210b1"

DEPENDS = "imx-vpu-hantro"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"

SRC_URI = " \
    ${FSL_MIRROR}/${BP}.tar.gz \
    file://0001-Makefile-Honor-LDFLAGS-from-toolchain.patch \
"
SRC_URI[md5sum] = "8487e6a79ea50f354396c829a77b9294"
SRC_URI[sha256sum] = "eb4b025aaa19d7b80ca8d8dfb7dede1bb97f346352060c6d477a6ca324778470"

PLATFORM_mx8mm = "IMX8MM"
PLATFORM_mx8mq = "IMX8MQ"
PLATFORM_mx8mp = "IMX8MP"

EXTRA_OEMAKE = " \
    CROSS_COMPILE="${HOST_PREFIX}" \
    SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" \
    CTRLSW_HDRPATH="${STAGING_INCDIR}" \
    PLATFORM="${PLATFORM}" \
"

do_install () {
    oe_runmake install DEST_DIR="${D}"
}

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8mq|mx8mm|mx8mp)"
