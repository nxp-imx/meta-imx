# Copyright 2021 NXP
DESCRIPTION = "i.MX Hantro V4L2 Daemon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cd8bc2a79509c22fc9c1782a151210b1"

DEPENDS = "imx-vpu-hantro"
DEPENDS:append:mx8mp-nxp-bsp = " imx-vpu-hantro-vc"

SRC_URI = " \
    ${FSL_MIRROR}/${BP}.tar.gz \
"
SRC_URI[md5sum] = "ce0eda9e30adb4a2fabc6527f5be40f6"
SRC_URI[sha256sum] = "a8cec919b4a8fb7cec1cfb76b24d1c97a94814c513bf319b6867c575bc55cc7c"

PLATFORM:mx8mm-nxp-bsp = "IMX8MM"
PLATFORM:mx8mq-nxp-bsp = "IMX8MQ"
PLATFORM:mx8mp-nxp-bsp = "IMX8MP"

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
COMPATIBLE_MACHINE = "(mx8mq-nxp-bsp|mx8mm-nxp-bsp|mx8mp-nxp-bsp)"
