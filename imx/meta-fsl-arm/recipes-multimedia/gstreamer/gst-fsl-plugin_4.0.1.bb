# Copyright (C) 2013-14 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "5a3f01621a15d48ee9a6a707ad6e4fd9"
SRC_URI[sha256sum] = "ea487852cf3e2f01445afbcf487295600d4fe1de70a547df26a0cf2076b068b6"

DEPENDS_append = " gstreamer gst-plugins-base"

PACKAGECONFIG[wmv9mpdec] += "--enable-wmv9mpdec,--disable-wmv9mpdec,,${MSDEPENDS}"
PACKAGECONFIG[wmv78dec] += "--enable-wmv78dec,--disable-wmv78dec,,${MSDEPENDS}"

FILES_${PN} = "${libdir}/gstreamer-0.10/*.so ${datadir}"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la ${libdir}/pkgconfig/*.pc"
FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-gplay = "${bindir}/gplay"
FILES_${PN}-libgplaycore = "${libdir}/libgplaycore${SOLIBS}"
FILES_${PN}-libgstfsl = "${libdir}/libgstfsl-0.10${SOLIBS}"

COMPATIBLE_MACHINE = "(mx28|mx5|mx6)"
