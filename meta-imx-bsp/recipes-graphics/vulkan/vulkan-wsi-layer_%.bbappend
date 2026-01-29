FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://gitlab.freedesktop.org/mesa/vulkan-wsi-layer.git;protocol=https;branch=main \
           file://0001-MGS-6801-ccc-vkmark-on-wayland.patch \
           file://0002-MGS-6283-nxp-Add-support-of-VK_COMPOSITE_ALPHA_OPAQU.patch \
           file://0003-MGS-7487-nxp-fix-Vulkan-test-report-warning-msg.patch \
           file://0004-MGS-8232-nxp-fix-nxp-patch-build-issue-on-latest-vul.patch \
           file://0005-MGS-8467-nxp-adapt-unique_ptr-to-free-pointer-in-swa.patch \
           file://0006-VK_EXT_frame_boundary-Fixing-the-sType-used-in-VkFra.patch"
SRCREV = "f879ceeeee3ad7a306c00e8516e8a6d7ebc15c81"
