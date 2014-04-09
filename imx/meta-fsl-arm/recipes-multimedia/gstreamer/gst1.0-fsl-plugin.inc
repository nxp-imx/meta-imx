# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Gstreamer1.x freescale plugins"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
SECTION = "multimedia"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base libfslcodec libfslparser virtual/kernel"
DEPENDS_append_mx5 = " imx-lib imx-vpu"
DEPENDS_append_mx6 = " imx-lib imx-vpu libfslvpuwrap"
DEPENDS_append_mx6sl = " imx-lib"

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://COPYING-LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

S = "${WORKDIR}/gst1.0-fsl-plugins-${PV}"

SRC_URI = "${FSL_MIRROR}/gst1.0-fsl-plugins-${PV}.tar.gz"

inherit autotools pkgconfig

PLATFORM_mx6 = "MX6"
PLATFORM_mx6sl = "MX6SL"
PLATFORM_mx6sx = "MX6SX"

# Todo add a mechanism to map posible build targets
EXTRA_OECONF = "PLATFORM=${PLATFORM} \
                CPPFLAGS="-I${STAGING_KERNEL_DIR}/include/uapi -I${STAGING_KERNEL_DIR}/include""

PACKAGES =+ "${PN}-libmfwsconf ${PN}-libgplaycore ${PN}-libgstfsl \
             ${PN}-libme ${PN}-libgstbufmeta ${PN}-libmfwba \
             ${PN}-libfwvss ${PN}-gplay"

# FIXME: Add all features
# feature from excluded mm packages
PACKAGECONFIG[ac3] += ",,,libfslac3codec"
PACKAGECONFIG[ddp] += ",,,libfslddpcodec"
# feature from special mm packages
PACKAGECONFIG[aacp] += ",,,libfslaacpcodec"
MSDEPENDS = "libfslmsparser libfslmscodec"
PACKAGECONFIG[wma10dec] +=",,,${MSDEPENDS}"
PACKAGECONFIG[wma8enc] +="--enable-wma8enc,--disable-wma8enc,${MSDEPENDS},${MSDEPENDS}"

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so ${datadir}"
# Add codec list that the beep plugin run-time depended
BEEP_RDEPENDS = "libfslcodec-aac libfslcodec-mp3 libfslcodec-oggvorbis"
RDEPENDS_${PN} += "gst-plugins-good-id3demux libfslparser ${BEEP_RDEPENDS}"

FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/pkgconfig/*.pc"
FILES_${PN}-staticdev += "${libdir}/gstreamer-1.0/*.a"

FILES_${PN}-gplay = "${bindir}/gplay-1.0"
FILES_${PN}-libmfwsconf = "${libdir}/libmfwsconf${SOLIBS}"
FILES_${PN}-libgplaycore = "${libdir}/libgplaycore-1.0${SOLIBS}"
FILES_${PN}-libgstfsl = "${libdir}/libgstfsl-1.0${SOLIBS}"
FILES_${PN}-libme = "${libdir}/libme${SOLIBS}"
FILES_${PN}-libgstbufmeta = "${libdir}/libgstbufmeta${SOLIBS}"
FILES_${PN}-libmfwba =  "${libdir}/libmfwba${SOLIBS}"
FILES_${PN}-libfwvss = "${libdir}/libmfwvss${SOLIBS}"
