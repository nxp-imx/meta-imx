SUMMARY = "Tools for tracing OpenGL, Direct3D, and other graphics APIs"
HOMEPAGE = "http://apitrace.github.io/"
SECTION = "console/tools"
LICENSE = "MIT & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50 \
                    file://thirdparty/snappy/COPYING;md5=f62f3080324a97b3159a7a7e61812d0c"

DEPENDS = "zlib libpng procps python3-native"

SRC_URI = "${APITRACE_SRC};branch=${SRCBRANCH}"
APITRACE_SRC ?= "gitsm://github.com/nxp-imx/apitrace-imx.git;protocol=https"
SRCBRANCH = "imx_12.0"
SRCREV = "79704ef306e9bb89e999c2369e5c099cddad28fb"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ??= " \
    egl \
    ${PACKAGECONFIG_BACKEND} \
    ${PACKAGECONFIG_GPU2D} \
"

PACKAGECONFIG_BACKEND:mx6-nxp-bsp = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'waffle', \
       bb.utils.contains('DISTRO_FEATURES',     'x11',    'x11', \
                                                             '', d), d)} \
"
PACKAGECONFIG_BACKEND:mx7-nxp-bsp = "${PACKAGECONFIG_BACKEND:mx6-nxp-bsp}"
PACKAGECONFIG_BACKEND:mx8-nxp-bsp = "waffle"
PACKAGECONFIG_BACKEND:mx9-nxp-bsp = "waffle"

PACKAGECONFIG_GPU2D             = ""
PACKAGECONFIG_GPU2D:imxgpu2d    = "vivante"
PACKAGECONFIG_GPU2D:mx9-nxp-bsp = ""

PACKAGECONFIG[egl] = "-DENABLE_EGL=ON,-DENABLE_EGL=OFF,virtual/egl"
PACKAGECONFIG[gui] = "-DENABLE_GUI=ON,-DENABLE_GUI=OFF"
PACKAGECONFIG[multiarch] = "-DENABLE_MULTIARCH=ON,-DENABLE_MULTIARCH=OFF"
PACKAGECONFIG[waffle] = "-DENABLE_WAFFLE=ON,-DENABLE_WAFFLE=OFF,waffle"
PACKAGECONFIG[x11] = "-DENABLE_X11=ON,-DENABLE_X11=OFF"
PACKAGECONFIG[vivante] = "-DENABLE_VIVANTE=ON,-DENABLE_VIVANTE=OFF,virtual/libg2d"

EXTRA_OECMAKE += "\
    -DENABLE_STATIC_LIBGCC=OFF \
    -DENABLE_STATIC_LIBSTDCXX=OFF \
    -DPython3_ROOT_DIR=/usr/bin/python3-native \
"

# Use the bundled snappy library
EXTRA_OECMAKE += "\
    -DENABLE_STATIC_SNAPPY=ON \
"

SECURITY_CFLAGS:toolchain-clang = ""

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(imxgpu${RVGPU_MACHINE})"
RVGPU_MACHINE  = "${@bb.utils.contains('MACHINE_FEATURES', 'rvgpu-emu', '|${MACHINE}', '', d)}"
