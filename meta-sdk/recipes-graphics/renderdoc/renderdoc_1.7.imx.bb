require renderdoc-1.7.inc

SRC_URI += " \
    file://0003-Continue-running-when-EnumerateDeviceExtensionProper.patch \
    file://0004-Pass-memory-checking-when-replaying-captures.patch \
    file://0005-Use-specific-integer-format-to-generate-a-dummy-mult.patch \
    file://0006-renderdoc-CMakeLists.txt-Set-TARGET-DESTINATION-usin.patch \
"

DEPENDS_remove = "virtual/libgl"
DEPENDS += "${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)}"

REQUIRED_DISTRO_FEATURES_remove = "opengl"

EXTRA_OECMAKE_remove = " \
    -DCMAKE_BUILD_TYPE=Release \
"
EXTRA_OECMAKE += " \
    -DENABLE_GL=OFF \
    -DENABLE_GLES=OFF \
    -DENABLE_VULKAN=ON \
    -DENABLE_WAYLAND=ON \
"

do_compile_prepend () {
    if [ "${base_libdir}" != "lib" ]; then
        export LIB_SUFFIX="64"
    fi
}
