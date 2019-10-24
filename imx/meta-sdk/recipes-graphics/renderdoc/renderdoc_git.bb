# Copyright 2019-2020 NXP
# Released under the MIT license 

DESCRIPTION = "RenderDoc is a free MIT licensed stand-alone graphics debugger that \
allows quick and easy single-frame capture and detailed introspection of any \
application using Vulkan, D3D11, OpenGL & OpenGL ES or D3D12 across Windows 7 - 10,\
Linux, Android, or Nintendo Switch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9753b1b4fba3261c27d1ce5c1acef667"
<<<<<<< HEAD:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_1.2.bb

RENDERDOC_SRC ?= "git://source.codeaurora.org/external/imx/renderdoc-imx.git;protocol=https"
SRCBRANCH = "v1.x-release"
SRC_URI = " \
    ${RENDERDOC_SRC};branch=${SRCBRANCH} \
"
SRCREV  = "bdb818d42bc99ab4b273e6741bb8dedc29cc0477"
S = "${WORKDIR}/git"
PV= "1.2"
=======
SRC_URI = "git://github.com/baldurk/renderdoc.git;branch=v1.x \
           file://0001-Add-basic-support-for-Wayland-replay-on-renderdoccmd.patch \
           file://0002-Add-window-functionalities-for-Wayland-replay-suppor.patch \
           file://0003-Continue-running-when-EnumerateDeviceExtensionProper.patch \
           file://0004-Pass-memory-checking-when-replaying-captures.patch \
           file://0005-Add-build-script-for-i.MX8-target.patch \
"

SRC_URI[md5sum] = "4b99f9ea6e3f57c0bb6b5a34aa60b03b"
SRC_URI[sha256sum] = "0766e71cd73b062d0164ee3e35ca9d1fe0966411b9be7d0267c7111aef78c783"

SRCREV  = "76622f65aa88b7b9015a3b1d28f4a3027f4cd491"
S = "${WORKDIR}/git"
>>>>>>> a7e84d6... renderdoc: Change renderdoc 1.2 version to git.[YOCIMX-3922]:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_git.bb

inherit autotools pkgconfig cmake python3native

REQUIRED_DISTRO_FEATURES = "mesa-dev mesa-demo"
DEPENDS += "libx11 libxcb xcb-util-keysyms  mesa"

<<<<<<< HEAD:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_1.2.bb
EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DENABLE_EGL=ON \
=======
EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release \
>>>>>>> a7e84d6... renderdoc: Change renderdoc 1.2 version to git.[YOCIMX-3922]:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_git.bb
                  -DENABLE_PYRENDERDOC=OFF \
                  -DENABLE_QRENDERDOC=OFF -DENABLE_XLIB=OFF \
                  -DENABLE_XCB=OFF -DENABLE_GL=OFF \
                  -DENABLE_RENDERDOCCMD=ON -DENABLE_GLES=OFF \
                  -DENABLE_VULKAN=ON -DENABLE_WAYLAND=ON \
                  -DUSE_INTERCEPTOR_LIB=OFF \
"

<<<<<<< HEAD:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_1.2.bb
=======
OECMAKE_TARGET_COMPILE="renderdoccmd"

>>>>>>> a7e84d6... renderdoc: Change renderdoc 1.2 version to git.[YOCIMX-3922]:imx/meta-sdk/recipes-graphics/renderdoc/renderdoc_git.bb
FILES_${PN}-dev = "${data_dir}/usr/lib/librenderdoc.so"
FILES_${PN} += "${libdir}/* ${includedir}"

do_compile_prepend () {
    sed -i 's/c++ /g++ /g' ${B}/build.ninja
}
