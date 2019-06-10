SUMMARY = "Vulkan Header files and API registry"
DESCRIPTION = "Vulkan is a new generation graphics and compute API \
that provides efficient access to modern GPUs."
HOMEPAGE = "https://www.khronos.org/vulkan/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"
SRC_URI = "git://github.com/KhronosGroup/Vulkan-Headers.git;branch=sdk-1.1.92 \
           "
SRCREV = "114c3546e195819bd53a34b39f5194b2989a5b12"
UPSTREAM_CHECK_GITTAGREGEX = "sdk-(?P<pver>\d+(\.\d+)+)"

S = "${WORKDIR}/git"

REQUIRED_DISTRO_FEATURES = "vulkan"

inherit cmake distro_features_check
ANY_OF_DISTRO_FEATURES = "x11 wayland"

FILES_${PN} += "${datadir}/vulkan/registry"
