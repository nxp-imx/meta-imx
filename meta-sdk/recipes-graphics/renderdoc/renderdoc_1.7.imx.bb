require renderdoc-1.7.inc

SRC_URI += " \
    file://0003-Continue-running-when-EnumerateDeviceExtensionProper.patch \
    file://0004-Pass-memory-checking-when-replaying-captures.patch \
    file://0005-Use-specific-integer-format-to-generate-a-dummy-mult.patch \
    file://0006-renderdoc-CMakeLists.txt-Set-TARGET-DESTINATION-usin.patch \
"

REQUIRED_DISTRO_FEATURES_remove = "opengl"

PACKAGECONFIG ?= " \
    egl \
    ${@bb.utils.filter('DISTRO_FEATURES', 'vulkan wayland', d)} \
    xcb \
    xlib \
"

PACKAGECONFIG[egl]     = "-DENABLE_EGL=ON,-DENABLE_EGL=OFF"
PACKAGECONFIG[gl]      = "-DENABLE_GL=ON,-DENABLE_GL=OFF,virtual/libgl"
PACKAGECONFIG[gles]    = "-DENABLE_GLES=ON,-DENABLE_GLES=OFF"
PACKAGECONFIG[vulkan]  = "-DENABLE_VULKAN=ON,-DENABLE_VULKAN=OFF"
PACKAGECONFIG[wayland] = "-DENABLE_WAYLAND=ON,-DENABLE_WAYLAND=OFF,wayland"
PACKAGECONFIG[xcb]     = "-DENABLE_XCB=ON,-DENABLE_XCB=OFF"
PACKAGECONFIG[xlib]    = "-DENABLE_XLIB=ON,-DENABLE_XLIB=OFF"

EXTRA_OECMAKE_remove = " \
    -DCMAKE_BUILD_TYPE=Release \
"

do_compile_prepend () {
    if [ "${base_libdir}" != "lib" ]; then
        export LIB_SUFFIX="64"
    fi
}
