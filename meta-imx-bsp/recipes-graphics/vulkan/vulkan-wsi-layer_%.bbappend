FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://gitlab.freedesktop.org/mesa/vulkan-wsi-layer.git;protocol=https;branch=main \
           file://0001-MGS-9070-add-arm-r56p0-wsi-layer-changes.patch \
           file://0002-wsialloc-initialize-local_strides-array.patch \
           file://0003-MGS-6801-ccc-vkmark-on-wayland.patch \
           file://0004-Add-support-VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR.patch \
           file://0005-MGS-7487-nxp-fix-Vulkan-test-report-warning-msg.patch \
           file://0006-MGS-9060-mali-fix-swapchainMaintenance1-incorrectly-.patch \
           file://0007-MGS-6283-nxp-fix-segfault-in-opaque-alpha-init-on-OO.patch"
SRCREV = "c4993dd16baf288c4b696e56ecf7cd03839a6f8b"
