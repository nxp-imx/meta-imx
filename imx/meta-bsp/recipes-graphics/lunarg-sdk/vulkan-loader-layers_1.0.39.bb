SUMMARY = "Vulkan Ecosystem Components - Loader and Validation Layers"
DESCRIPTION = "Vulkan is a new generation graphics and compute API that \
               provides high-efficiency, cross-platform access to modern \
               GPUs used in a wide variety of devices from PCs and \
               consoles to mobile phones and embedded platforms."
SECTION = "graphics"
HOMEPAGE = "https://www.khronos.org/vulkan"
DEPENDS = "bison-native libx11 libxcb glslang glslang-native spirv-tools \
            libice libxext libsm"

RDEPENDS_${PN} = "${PN}-layer-libs libxcb-sync libxcb-present libxcb-dri3"

inherit cmake python3native

REQUIRED_DISTRO_FEATURES = "x11"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=99c647ca3d4f6a4b9d8628f757aad156"

S = "${WORKDIR}/git"

SRCREV = "9c21ed0fb275589c3af6118aec9ef4f1d1544dc1"
SRC_URI = "git://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers;branch=sdk-${PV} \
           file://0001-CMakeLists-add-include-path-so-Xlib.h-is-found-as-ne.patch \
           file://0005-install-demos.patch \
           file://0006-json-correct-layer-lib-paths.patch \
           file://0008-demos-make-shader-location-relative.patch \
           file://0009-vulkaninfo.c-fix-segfault-when-DISPLAY-is-not-set.patch"

EXTRA_OECMAKE = " \
    -DCUSTOM_GLSLANG_BIN_ROOT=1 \
    -DGLSLANG_BINARY_ROOT=${STAGING_DIR_HOST}/usr \
    -DCUSTOM_SPIRV_TOOLS_BIN_ROOT=1 \
    -DSPIRV_TOOLS_BINARY_ROOT=${STAGING_DIR_HOST}/usr \
    -DBUILD_TESTS=1 \
"

PACKAGES =+ "${PN}-layer-libs"
FILES_${PN}-layer-libs = "${libdir}/libVkLayer_*.so"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/libvulkan.so"
INSANE_SKIP_${PN} = "dev-so"
