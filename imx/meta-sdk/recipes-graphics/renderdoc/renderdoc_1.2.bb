# Copyright (C) 2019 NXP 
# Released under the MIT license 

DESCRIPTION = "RenderDoc is a free MIT licensed stand-alone graphics debugger that \
allows quick and easy single-frame capture and detailed introspection of any \
application using Vulkan, D3D11, OpenGL & OpenGL ES or D3D12 across Windows 7 - 10,\
Linux, Android, or Nintendo Switch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a0b697b56d2fec81641a44129bee114a"

SRC_URI = "git://github.com/baldurk/renderdoc.git;branch=v1.x"


SRC_URI[md5sum] = "4b99f9ea6e3f57c0bb6b5a34aa60b03b"
SRC_URI[sha256sum] = "0766e71cd73b062d0164ee3e35ca9d1fe0966411b9be7d0267c7111aef78c783"


SRCREV  = "145f4bdb151bc99c99deaf51141f67f8f47ba5d9"
S = "${WORKDIR}/git"
PV= "1.2"


inherit autotools pkgconfig cmake python3native

REQUIRED_DISTRO_FEATURES = "mesa-dev mesa-demo"
DEPENDS += "libx11 libxcb xcb-util-keysyms  mesa"


EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DENABLE_EGL=ON \
                  -DENABLE_PYRENDERDOC=OFF \
                  -DENABLE_QRENDERDOC=OFF -DENABLE_XLIB=OFF \
                  -DENABLE_XCB=OFF -DENABLE_GL=OFF "
OECMAKE_TARGET_COMPILE="renderdoccmd"


FILES_${PN}-dev = "${data_dir}/usr/lib/librenderdoc.so"
FILES_${PN} += "${libdir}/* ${includedir}"

do_compile_prepend () {
    sed -i 's/c++ /g++ /g' ${B}/build.ninja
}


