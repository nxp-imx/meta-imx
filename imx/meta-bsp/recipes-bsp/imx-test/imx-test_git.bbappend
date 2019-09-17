# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

SRCBRANCH = "imx_4.19.35_1.1.0"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH}"
SRC_URI_append = " file://memtool_profile "

SRCREV = "e5a1705544b3c5f96e180a77e8092c964277380a"

do_compile() {
    CFLAGS="${TOOLCHAIN_OPTIONS}"
    oe_runmake V=1 VERBOSE='' \
               CROSS_COMPILE=${TARGET_PREFIX} \
               CC="${CC} ${LDFLAGS} \
                    -I${S}/include \
                    -I${STAGING_INCDIR_IMX} \
                    -I${STAGING_INCDIR} \
                    -L${STAGING_LIBDIR}" \
               SDKTARGETSYSROOT=${STAGING_DIR_HOST} \
               LINUXPATH=${STAGING_KERNEL_DIR} \
               KBUILD_OUTPUT=${STAGING_KERNEL_BUILDDIR} \
               PLATFORM=${PLATFORM}
}
