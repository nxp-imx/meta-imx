# Copyright 2017-2020 NXP

DESCRIPTION = "i.MX Hantro VPU library"
LICENSE = "Proprietary"

PROVIDES = "virtual/imxvpu"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

inherit fsl-eula-unpack use-imx-headers

PARALLEL_MAKE="-j 1"

PLATFORM_mx8mm = "IMX8MM"
PLATFORM_mx8mq = "IMX8MQ"
PLATFORM_mx8mp = "IMX8MP"

do_compile () {
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" \
        SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" \
        PLATFORM="${PLATFORM}" all
}

do_install () {
    oe_runmake DEST_DIR="${D}" PLATFORM="${PLATFORM}" install
}

FILES_${PN} += "/unit_tests"

COMPATIBLE_MACHINE = "(mx8mq|mx8mm|mx8mp)"
