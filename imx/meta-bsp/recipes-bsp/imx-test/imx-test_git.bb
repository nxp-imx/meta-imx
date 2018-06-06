# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_remove        = " virtual/kernel"
DEPENDS_append        = " alsa-lib libdrm linux-imx-headers"
DEPENDS_append_imxvpu = " virtual/imxvpu"

PV = "7.0+${SRCPV}"

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH}"
SRC_URI_append = " file://memtool_profile "

SRCREV = "4556f2590fa144a5d5c60c943d356ff6f5fd8704"

S = "${WORKDIR}/git"

PLATFORM_mx8 = "IMX8"

IMX_HAS_VPU         = "false"
IMX_HAS_VPU_imxvpu  = "true"
EXTRA_OEMAKE       += "HAS_VPU=${IMX_HAS_VPU}"

PARALLEL_MAKE="-j 1"

do_compile() {
    CFLAGS="${TOOLCHAIN_OPTIONS}"
    oe_runmake V=1 VERBOSE='' \
               CROSS_COMPILE=${TARGET_PREFIX} \
               CC="${CC} -I${STAGING_EXECPREFIXDIR}/imx/include -L${STAGING_LIBDIR} ${LDFLAGS}" \
               LINUXPATH=${STAGING_KERNEL_DIR} \
               KBUILD_OUTPUT=${STAGING_KERNEL_BUILDDIR} \
               PLATFORM=${PLATFORM}
}

do_install_append() {
    install -d -m 0755 ${D}/home/root/
    install -m 0644 ${WORKDIR}/memtool_profile ${D}/home/root/.profile
}

# Avoid race condition between tasks. This should be upstreamed to meta-freescale.
addtask make_scripts after do_configure before do_compile

FILES_${PN} += " /home/root/.profile "

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"

EXTRA_OEMAKE += "SDKTARGETSYSROOT=${STAGING_DIR_HOST}"
