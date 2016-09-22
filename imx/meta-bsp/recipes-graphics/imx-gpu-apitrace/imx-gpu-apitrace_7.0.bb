SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "d408a9ca549bb9fbfef160bcad195cbc"
SRC_URI[sha256sum] = "ff0d795ef59aa9f3af53a69a3962e9591ee3b9baf6e8c7147f2e4bec460ea728"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', \
                bb.utils.contains('DISTRO_FEATURES', 'fb', '-DDISABLE_X11=ON -DCMAKE_SYSROOT=${STAGING_DIR_HOST}', '', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
