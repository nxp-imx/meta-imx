# Copyright 2017-2018 NXP

DESCRIPTION = "i.MX HANTRO VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://vpu/EULA.txt;md5=b063366b066c9f10037c59756a9ced54"

inherit fsl-eula-unpack use-imx-headers

PARALLEL_MAKE="-j 1"

PROVIDES = "virtual/imxvpu"
RPROVIDES_${PN} = "virtual/imxvpu"

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"

PLATFORM_mx8mm = "IMX8MM"
PLATFORM_mx8mq = "IMX8MQ"
PLATFORM_mx8mp = "IMX8MP"

do_compile () {
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" SDKTARGETSYSROOT="${STAGING_DIR_TARGET}" PLATFORM="${PLATFORM}" all
}

do_install () {
    oe_runmake DEST_DIR="${D}" PLATFORM="${PLATFORM}" install
}

FILES_${PN} += "/unit_tests"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx8mq|mx8mm|mx8mp)"
