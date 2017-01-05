SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "virtual/libg2d imx-gpu-viv zlib libpng"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "9ea9c16b5aba8e6a60103ee7ed34947d"
SRC_URI[sha256sum] = "969ff6fb2fa91c929ed7d104136bf64543917b07ff54364ccc2dd7581558accf"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
