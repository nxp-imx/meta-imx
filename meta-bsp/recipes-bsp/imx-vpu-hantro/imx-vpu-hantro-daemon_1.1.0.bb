# Copyright 2021 NXP
DESCRIPTION = "i.MX Hantro V4L2 Daemon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cd8bc2a79509c22fc9c1782a151210b1"

DEPENDS = "imx-vpu-hantro"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"

SRC_URI = " \
    ${FSL_MIRROR}/${BP}.tar.gz \
    file://Honor-ldflags.patch \
"
SRC_URI[md5sum] = "abdc86bde253b48f4e1685a70e4767e0"
SRC_URI[sha256sum] = "906a2def3e99f5718d83a4da2242aa6a7245343513ec79f7df5850c761a0f9df"

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
