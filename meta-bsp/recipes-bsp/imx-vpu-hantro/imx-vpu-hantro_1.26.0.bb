# Copyright 2017-2020 NXP

DESCRIPTION = "i.MX Hantro VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=dedee5689786754f61ea3a76035c8a81" 

PROVIDES = "virtual/imxvpu"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "a7b35fadb29f08c9514b50474d8bdb9e"
SRC_URI[sha256sum] = "a4cc0f6696cb7eb92d4cd4264965a287718acb3ad27f49796e88e3680fdbd870"

inherit fsl-eula-unpack use-imx-headers

PARALLEL_MAKE="-j 1"

PLATFORM:mx8mm = "IMX8MM"
PLATFORM:mx8mq = "IMX8MQ"
PLATFORM:mx8mp = "IMX8MP"

EXTRA_OEMAKE = " \
    CROSS_COMPILE="${HOST_PREFIX}" \
    SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" \
    PLATFORM="${PLATFORM}" \
"

do_install () {
    oe_runmake install DEST_DIR="${D}"
}

FILES:${PN} += "/unit_tests"

RDEPENDS:${PN} += "imx-vpu-hantro-daemon"

COMPATIBLE_MACHINE = "(mx8mq|mx8mm|mx8mp)"
