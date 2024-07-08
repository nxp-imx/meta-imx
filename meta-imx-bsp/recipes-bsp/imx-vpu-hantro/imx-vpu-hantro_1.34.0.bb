# Copyright 2017-2020,2023-2024 NXP

DESCRIPTION = "i.MX Hantro VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a" 

PROVIDES = "virtual/imxvpu"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "a0eda50"

SRC_URI[sha256sum] = "1a9eb8e859acc466e80870ff6e0db8363d801ec8a4280e16384a346d3b09c0fd"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"

inherit fsl-eula-unpack use-imx-headers

PARALLEL_MAKE="-j 1"

PLATFORM:mx8mm-nxp-bsp = "IMX8MM"
PLATFORM:mx8mq-nxp-bsp = "IMX8MQ"
PLATFORM:mx8mp-nxp-bsp = "IMX8MP"

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

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx8mq-nxp-bsp|mx8mm-nxp-bsp|mx8mp-nxp-bsp)"
