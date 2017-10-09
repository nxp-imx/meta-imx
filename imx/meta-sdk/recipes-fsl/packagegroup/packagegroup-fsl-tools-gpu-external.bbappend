# fb packages
# Support glmark2 drm in FB for mx8qm/mx8qxp only
SOC_TOOLS_GPU_FB_append_mx8mq = " vulkan-loader-layers vulkan-loader-layers-dev"
SOC_TOOLS_GPU_FB_append_mx8qm = " vulkan-loader-layers vulkan-loader-layers-dev glmark2"
SOC_TOOLS_GPU_FB_append_mx8qxp = " vulkan-loader-layers vulkan-loader-layers-dev glmark2"

# xwayland packages
SOC_TOOLS_GPU_XWAYLAND_append_mx8 = " vulkan-loader-layers vulkan-loader-layers-dev"

# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_imxgpu2d = "opencv-samples"

RDEPENDS_${PN} += " \
    ${OPENCV_TOOLS_INSTALL} \
"
