# Copyright (C) 2013 Freescale Semiconductor

require recipes-bsp/imx-lib/imx-lib.inc

SRC_URI = "${FSL_MIRROR}/imx-lib-${PV}.tar.gz"
SRC_URI[md5sum] = "60846fef897e4c6b77b5165e46cb0c44"
SRC_URI[sha256sum] = "314bd1f148fb2a749219a871d1fc80a90e1b8e78151f7c3efc3a2c76d7c0d166"

PE = "1"

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
