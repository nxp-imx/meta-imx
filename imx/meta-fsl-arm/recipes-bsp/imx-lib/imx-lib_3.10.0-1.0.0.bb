# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/imx-lib-${PV}-1.0.0.tar.gz"
SRC_URI[md5sum] = "44bb1ddb3f58ba76b0ef7cb62ae0cf0a"
SRC_URI[sha256sum] = "a712a477671f630c5d2cd690bbaa3211bae616fde8452e94c2668eef9a93e9e0"
S = "${WORKDIR}/${PN}-${PV}-1.0.0"

do_compile () {
    INCLUDE_DIR="-I${STAGING_INCDIR}/uapi -I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include"

    #take out rng and sahara2 because of missing header 
    ##FIXME - waiting on imx-lib fix to exclude these on mx6
    if [ -d rng ]; then
        rm -f rng/Makefile
    fi
    if [ -d sahara2]; then
        rm -f sahara2/Makefile
    fi

    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6)"
