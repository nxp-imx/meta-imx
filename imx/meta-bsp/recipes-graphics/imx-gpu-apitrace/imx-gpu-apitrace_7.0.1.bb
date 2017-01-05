SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "virtual/libg2d imx-gpu-viv zlib libpng"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "2fcba76cd1ca4955e31db1ef5b101889"
SRC_URI[sha256sum] = "7cdaacd4e4a0c666a618c2ea96746918ac41948eaf68ccb866264bd12e70bc53"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
