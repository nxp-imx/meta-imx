# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gst-fsl-plugin.inc

SRC_URI = "${FSL_MIRROR}/gst1.0-fsl-plugins-${PV}.tar.gz"
S = "${WORKDIR}/gst1.0-fsl-plugins-${PV}"

EXTRA_OECONF += " CROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

SRC_URI[md5sum] = "38d20aa22910a841593318aa638fb702"
SRC_URI[sha256sum] = "972babc09f53fb0139a350c5b4267101793fcb96d289c4ae402d6a6ddddbe085"

DEPENDS_append = " gstreamer1.0 gstreamer1.0-plugins-base gpu-viv-bin"

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so ${datadir}"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/pkgconfig/*.pc"
FILES_${PN}-staticdev += "${libdir}/gstreamer-1.0/*.a"
FILES_${PN}-gplay = "${bindir}/gplay-1.0"
FILES_${PN}-libgplaycore = "${libdir}/libgplaycore-1.0${SOLIBS}"
FILES_${PN}-libgstfsl = "${libdir}/libgstfsl-1.0${SOLIBS}"

COMPATIBLE_MACHINE = "(mx6)"
