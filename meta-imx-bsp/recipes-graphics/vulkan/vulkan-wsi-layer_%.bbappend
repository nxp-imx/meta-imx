FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://gitlab.freedesktop.org/mesa/vulkan-wsi-layer.git;protocol=https;branch=main \
           file://0001-MGS-8232-ccc-arm-patch-based-on-opensource-vulkan-ws.patch \
           file://0002-MGS-6801-ccc-vkmark-on-wayland.patch \
           file://0003-MGS-6283-nxp-Add-support-of-VK_COMPOSITE_ALPHA_OPAQU.patch \
           file://0004-MGS-7487-nxp-fix-Vulkan-test-report-warning-msg.patch \
           file://0005-MGS-8232-nxp-fix-nxp-patch-build-issue-on-latest-vul.patch \
           file://0006-MGS-8368-nxp-fix-the-function-pointer-query-logic.patch"
SRCREV = "5097740a4575e69ea17f6910ff62eea59a380bbf"

S = "${WORKDIR}/git"
