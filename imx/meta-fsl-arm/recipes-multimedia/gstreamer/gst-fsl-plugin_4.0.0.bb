# Copyright (C) 2013-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI = "${FSL_MIRROR}/gst-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst-fsl-plugins-${PV}"

SRC_URI[md5sum] = "42bfa7311fb6dfe731da922496eaf81a"
SRC_URI[sha256sum] = "a48b18dbad8e21b51a653c53c768558fcaa42ff461c027bd87fa6978048b69fc"

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
