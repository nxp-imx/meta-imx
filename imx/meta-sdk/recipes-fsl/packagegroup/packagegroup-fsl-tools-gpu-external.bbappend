VULKAN_TOOLS = "vulkan-loader-layers vulkan-loader-layers-dev"

SOC_TOOLS_GPU_FB_append_mx8    = " ${VULKAN_TOOLS}"
SOC_TOOLS_GPU_FB_append_mx8qm  = " glmark2"
SOC_TOOLS_GPU_FB_append_mx8qxp = " glmark2"

SOC_TOOLS_GPU_XWAYLAND_append_mx8 = " ${VULKAN_TOOLS}"

RDEPENDS_${PN}_append_imxgpu = " opencv-samples"
