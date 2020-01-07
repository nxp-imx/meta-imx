# Copyright 2019-2020 NXP
# Released under the MIT license 

DESCRIPTION = "RenderDoc is a free MIT licensed stand-alone graphics debugger that \
allows quick and easy single-frame capture and detailed introspection of any \
application using Vulkan, D3D11, OpenGL & OpenGL ES or D3D12 across Windows 7 - 10,\
Linux, Android, or Nintendo Switch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9753b1b4fba3261c27d1ce5c1acef667"

RENDERDOC_SRC ?= "git://source.codeaurora.org/external/imx/renderdoc-imx.git;protocol=https"
SRCBRANCH = "v1.x-release"
SRC_URI = " \
    ${RENDERDOC_SRC};branch=${SRCBRANCH} \
"
SRCREV  = "bdb818d42bc99ab4b273e6741bb8dedc29cc0477"
S = "${WORKDIR}/git"
PV= "1.4+git${SRCPV}"

inherit autotools pkgconfig cmake python3native

REQUIRED_DISTRO_FEATURES = "mesa-dev mesa-demo"
DEPENDS += "libx11 libxcb xcb-util-keysyms  mesa"

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release \
                  -DENABLE_PYRENDERDOC=OFF \
                  -DENABLE_QRENDERDOC=OFF -DENABLE_XLIB=OFF \
                  -DENABLE_XCB=OFF -DENABLE_GL=OFF \
                  -DENABLE_RENDERDOCCMD=ON -DENABLE_GLES=OFF \
                  -DENABLE_VULKAN=ON -DENABLE_WAYLAND=ON \
                  -DUSE_INTERCEPTOR_LIB=OFF"

OECMAKE_TARGET_COMPILE="renderdoccmd"

FILES_${PN}-dev = "${data_dir}/usr/lib/librenderdoc.so"
FILES_${PN} += "${libdir}/* ${includedir}"

do_compile_prepend () {
    sed -i 's/c++ /g++ /g' ${B}/build.ninja
}
