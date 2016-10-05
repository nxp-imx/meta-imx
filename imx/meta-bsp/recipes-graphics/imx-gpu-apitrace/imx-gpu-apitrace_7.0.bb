SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "virtual/libg2d imx-gpu-viv zlib libpng"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "577802a497a301c820a3628083075334"
SRC_URI[sha256sum] = "260988f6d661cab0ea5e6ba875e344a75bcbfa51f332e4f232c6200e67447bab"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', \
                bb.utils.contains('DISTRO_FEATURES', 'x11', '', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
