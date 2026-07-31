FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://gitlab.freedesktop.org/mesa/vulkan-wsi-layer.git;protocol=https;branch=main \
           file://0001-MGS-9070-add-arm-r56p0-wsi-layer-changes.patch \
           file://0002-wsialloc-initialize-local_strides-array.patch \
           file://0003-MGS-6801-ccc-vkmark-on-wayland.patch \
           file://0004-Add-support-VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR.patch \
           file://0005-MGS-9060-mali-fix-swapchainMaintenance1-incorrectly-.patch \
           file://0006-MGS-6283-nxp-fix-segfault-in-opaque-alpha-init-on-OO.patch"
SRCREV = "feb069171fa301893e99ed15708466fc2c10c0c1"

