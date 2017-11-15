SUMMARY = "Samples for OpenGL ES"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50"
DEPENDS = "imx-gpu-viv zlib libpng procps"
DEPENDS_append_imxgpu2d = " virtual/libg2d"

APITRACE_SRC ?= "git://source.codeaurora.org/external/imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_4.9.51_imx8_beta1"
SRC_URI_imxgpu = "${APITRACE_SRC};branch=${SRCBRANCH} "
SRCREV_imxgpu = "9281b2c2f2766caf3529df347289128470318537"

S = "${WORKDIR}/git"

inherit cmake lib_package pkgconfig perlnative pythonnative

EXTRA_OECMAKE_append_imxgpu2d = " -DENABLE_VIVANTE=ON"
EXTRA_OECMAKE_append          = " -DENABLE_MULTIARCH=OFF"
EXTRA_OECMAKE_append          = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' -DDISABLE_X11=ON', \
        bb.utils.contains('DISTRO_FEATURES',     'x11', '', \
                                                        ' -DDISABLE_X11=ON', d), d)}"

FILES_${PN} = "${bindir} ${libdir}"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp|mx8)"
