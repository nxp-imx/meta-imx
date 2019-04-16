# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Installs i.MX-specific kernel headers"
DESCRIPTION = "Installs i.MX-specific kernel headers to userspace. \
New headers are installed in ${includedir}/imx."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCBRANCH = "imx_4.19.y"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "d469707a6fbb2febf5ae76d46217b9efd4d4b165"

S = "${WORKDIR}/git"

do_compile[noexec] = "1"

IMX_UAPI_HEADERS = " \
    dma-buf.h \
    hantrodec.h \
    hx280enc.h \
    ion.h \
    ipu.h \
    isl29023.h \
    mxc_asrc.h \
    mxc_dcic.h \
    mxc_mlb.h \
    mxc_sim_interface.h \
    mxc_v4l2.h \
    mxcfb.h \
    pxp_device.h \
    pxp_dma.h \
    videodev2.h \
"
# FIXME: Restore imx_drm.h when supported
IMX_UAPI_DRM_HEADERS = " \
"

do_install() {
    # We install all headers inside of B so we can copy only the
    # whitelisted ones, and there is no risk of a new header to be
    # installed by mistake.
    oe_runmake headers_install INSTALL_HDR_PATH=${B}${exec_prefix}

    # FIXME: The ion.h is still on staging so "promote" it for now
    cp ${S}/drivers/staging/android/uapi/ion.h ${B}${includedir}/linux

    # Install whitelisted headers only
    for h in ${IMX_UAPI_HEADERS}; do
        install -D -m 0644 ${B}${includedir}/linux/$h \
	                   ${D}${includedir}/imx/linux/$h
    done
    for h in ${IMX_UAPI_DRM_HEADERS}; do
        install -D -m 0644 ${B}${includedir}/drm/$h \
	                   ${D}${includedir}/imx/drm/$h
    done
}

ALLOW_EMPTY_${PN} = "1"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
