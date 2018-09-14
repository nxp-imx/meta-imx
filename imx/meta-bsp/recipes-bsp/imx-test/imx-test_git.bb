# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

SUMMARY = "Test programs for IMX BSP"
DESCRIPTION = "Unit tests for the IMX BSP"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS  = "alsa-lib libdrm"
DEPENDS_append_mx6 = " imx-lib"
DEPENDS_append_mx7 = " imx-lib"
DEPENDS_append_imxvpu = " virtual/imxvpu"

PE = "1"
PV = "7.0+${SRCPV}"

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://source.codeaurora.org/external/imx/imx-test.git;protocol=https"
SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH}"
SRC_URI_append = " file://memtool_profile "

SRCREV = "63f2a98bab76aba6604fc91689e6eb0f3c557176"

S = "${WORKDIR}/git"

inherit module-base use-imx-headers

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

PLATFORM_mx6q  = "IMX6Q"
PLATFORM_mx6dl = "IMX6Q"
PLATFORM_mx6sl = "IMX6SL"
PLATFORM_mx6sll = "IMX6SL"
PLATFORM_mx6sx = "IMX6SX"
PLATFORM_mx6ul = "IMX6UL"
PLATFORM_mx7d  = "IMX7D"
PLATFORM_mx7ulp  = "IMX7D"
PLATFORM_mx8 = "IMX8"

PARALLEL_MAKE="-j 1"
EXTRA_OEMAKE += "${PACKAGECONFIG_CONFARGS}"

PACKAGECONFIG = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '', d)}"
PACKAGECONFIG_append_imxvpu = " vpu"

PACKAGECONFIG[x11] = ",,libx11 libxdamage libxrender libxrandr"
PACKAGECONFIG[vpu] = "HAS_VPU=true,HAS_VPU=false,virtual/imxvpu"

do_compile() {
    CFLAGS="${TOOLCHAIN_OPTIONS}"
    oe_runmake V=1 VERBOSE='' \
               CROSS_COMPILE=${TARGET_PREFIX} \
               CC="${CC} ${LDFLAGS} \
                    -I${S}/include \
                    -I${STAGING_INCDIR} \
                    -I${STAGING_INCDIR_IMX} \
                    -L${STAGING_LIBDIR}" \
               LINUXPATH=${STAGING_KERNEL_DIR} \
               KBUILD_OUTPUT=${STAGING_KERNEL_BUILDDIR} \
               PLATFORM=${PLATFORM}
}

do_install() {
    oe_runmake DESTDIR=${D}/unit_tests \
               PLATFORM=${PLATFORM} \
               install

    if [ -e ${WORKDIR}/clocks.sh ]; then
        install -m 755 ${WORKDIR}/clocks.sh ${D}/unit_tests/clocks.sh
    fi

    install -d -m 0755 ${D}/home/root/
    install -m 0644 ${WORKDIR}/memtool_profile ${D}/home/root/.profile
}

FILES_${PN} += "/unit_tests /home/root/.profile "
RDEPENDS_${PN} = "bash"

FILES_${PN}-dbg += "/unit_tests/.debug"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"

EXTRA_OEMAKE += "SDKTARGETSYSROOT=${STAGING_DIR_HOST}"
