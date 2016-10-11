#include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc
include gstreamer1.0-plugins-bad.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50"


SRC_URI[md5sum] = "111632f8d1d1ba39bbf3665aaafcb28c"
SRC_URI[sha256sum] = "d8ff26128d4ecd2ffeb28e14843808d2d971b09056b7cee6f08afcae01fc0f49"


CFLAGS_append_mx6 = " -DLINUX \
                      ${@base_contains('DISTRO_FEATURES', 'x11', '', \
                         base_contains('DISTRO_FEATURES', 'wayland', '-DEGL_API_FB -DWL_EGL_PLATFORM', '-DEGL_API_FB', d), d)}"

PACKAGECONFIG_GL_mx6sl = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', \
                           base_contains('DISTRO_FEATURES', 'x11', \
                                    'opengl', '', d), '', d)}"

S = "${WORKDIR}/gst-plugins-bad-${PV}"
FILES_${PN} += "/usr/share/gstreamer-1.0"
FILES_${PN} += "${libdir}/gstreamer-1.0/include"
