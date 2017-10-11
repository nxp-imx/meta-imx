VULKAN_TOOLS = "vulkan-loader-layers vulkan-loader-layers-dev"

SOC_TOOLS_GPU_FB_append_mx8    = " ${VULKAN_TOOLS}"
SOC_TOOLS_GPU_FB_append_mx8qm  = " glmark2"
SOC_TOOLS_GPU_FB_append_mx8qxp = " glmark2"

SOC_TOOLS_GPU_XWAYLAND_append_mx8 = " ${VULKAN_TOOLS}"

# OpenCV test apps
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_imxgpu2d = "opencv-samples"

RDEPENDS_${PN} += " \
    ${OPENCV_TOOLS_INSTALL} \
"
