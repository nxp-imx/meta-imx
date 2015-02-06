# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "baac56f36cae1aac64eb52eeac0849f0"
SRC_URI[sha256sum] = "a465ff81192f6d70f3c3220f1d7e58a3b23acd4f6075711675ad870360f5b8eb"

DEPENDS_append = " gstreamer gst-plugins-base"

# FIXME: Add all features
# feature from excluded mm packages
PACKAGECONFIG[ac3] += "--enable-ac3dec,--disable-ac3dec,libfslac3codec,libfslac3codec"
# feature from special mm packages
PACKAGECONFIG[aacp] += "--enable-aacpdec,--disable-aacpdec,libfslaacpcodec,libfslaacpcodec"
MSDEPENDS = "libfslmsparser libfslmscodec"
PACKAGECONFIG[wma10dec] +="--enable-wma10dec,--disable-wma10dec,${MSDEPENDS},${MSDEPENDS}"
PACKAGECONFIG[wma8enc] +="--enable-wma8enc,--disable-wma8enc,${MSDEPENDS},${MSDEPENDS}"
PACKAGECONFIG[wmv9mpdec] +="--enable-wmv9mpdec,--disable-wmv9mpdec,${MSDEPENDS},${MSDEPENDS}"
PACKAGECONFIG[wmv78dec] +="--enable-wmv78dec,--disable-wmv78dec,${MSDEPENDS},${MSDEPENDS}"

FILES_${PN} = "${libdir}/gstreamer-0.10/*.so ${datadir}"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la ${libdir}/pkgconfig/*.pc"
FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-gplay = "${bindir}/gplay"
FILES_${PN}-libgplaycore = "${libdir}/libgplaycore${SOLIBS}"
FILES_${PN}-libgstfsl = "${libdir}/libgstfsl-0.10${SOLIBS}"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
